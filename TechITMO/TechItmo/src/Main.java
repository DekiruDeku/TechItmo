import LabaFromJava5.SQLManager;
import LabaFromJava5.SongInDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
        SQLManager sqlman = new SQLManager();

        sqlman.Conn();
        sqlman.ReadDB();



        sqlman.WriteDB("Heart-shaped box", "Nirvana",1993-12-12, 15.50f, 10.10f,1 );
        // sqlman.DeleFromBD(int -);
        SongInDB song = sqlman.FindById(15); // аэросмит
        List<SongInDB> songs = sqlman.FindByArtist("Madonna"); // мадона

        sqlman.CloseDB();
    }
}