package LabaFromJava5;
import org.sqlite.JDBC;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SQLManager { // фасад с GoF
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static Connection conn;
    public static Statement state;
    public static ResultSet resSet;
    public SQLManager(){}

    public static void Conn() throws SQLException // Метод подключения к бд
    {
        conn = null;
        DriverManager.registerDriver(new JDBC());
        conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
        System.out.println(conn.getMetaData().getDriverName());
        System.out.println(conn.getMetaData().getUserName());
        state = conn.createStatement();
        System.out.println("Connected to DB");
    }

    public static void ReadDB() throws SQLException // Метод чтения бд
    {
        resSet = state.executeQuery("SELECT * FROM Item");

        while(resSet.next())
        {
            int id = resSet.getInt("item_id");
            String title = resSet.getString("title");
            System.out.printf("%s (%s)\n\r", title, id);
        }

        System.out.println("DB read");
    }

    public static void WriteDB(String title, String artist, long date, float listPrice, float price, int version) { // Метод добавления к бд
        String sql = "INSERT INTO Item " +
                "(Title, Artist, ReleaseDate, ListPrice, Price, Version) " +
                "VALUES (?,?,?,?,?,?); ";
        try (PreparedStatement prepareStatement = conn.prepareStatement(sql)){
            prepareStatement.setString(1, title);
            prepareStatement.setString(2, artist);
            prepareStatement.setString(3, dateFormat.format(date));
            prepareStatement.setFloat(4, listPrice);
            prepareStatement.setFloat(5, price);
            prepareStatement.setInt(6, version);
            prepareStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Row inserted into DB");
    }

    public static SongInDB FindById(int itemId) throws SQLException, ParseException { // Метод нахождения в бд
        String sql = "SELECT * FROM Item where ITEM_ID = ?";
        SongInDB songItem = null;
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setInt(1, itemId);
        resSet = prepareStatement.executeQuery();
        if(resSet.next())
        {
            int id = resSet.getInt("item_id");
            String title = resSet.getString("title");
            String artist = resSet.getString("artist");
            String date = resSet.getString("releaseDate");
            float listPrice = resSet.getFloat("listPrice");
            float price = resSet.getFloat("price");
            int version = resSet.getInt("version");
            songItem = new SongInDB.Builder(id, title, artist, dateFormat.parse(date), listPrice, price, version).build();
        }

        System.out.println("Find by Id");
        return songItem;
    }
    public static List<SongInDB> FindByArtist(String artist) throws SQLException, ParseException { // Метод нахождения в бд
        String sql = "SELECT * FROM Item where Artist = ?";
        List<SongInDB> songList = new ArrayList<>();
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setString(1, artist);
        resSet = prepareStatement.executeQuery();
        while(resSet.next())
        {
            int id = resSet.getInt("item_id");
            String title = resSet.getString("title");
            String date = resSet.getString("releaseDate");
            float listPrice = resSet.getFloat("listPrice");
            float price = resSet.getFloat("price");
            int version = resSet.getInt("version");
            songList.add(new SongInDB.Builder(id, title, artist, dateFormat.parse(date), listPrice, price, version).build());
        }

        System.out.println("Find by Artist");
        return songList;
    }

    public static void DeleteFromBD(int ID) throws SQLException, ParseException {
        String sql = "DELETE FROM Item WHERE `ITEM_ID` = ?";
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
             PreparedStatement statement
                     = connection.prepareStatement(sql)) {

            statement.setInt(1, ID);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Delete rows: " + rowsAffected);
    }
    }

    public static void CloseDB() throws SQLException // закрытия бд
    {
        conn.close();
        state.close();
        resSet.close();

        System.out.println("Connection closed");
    }
}
