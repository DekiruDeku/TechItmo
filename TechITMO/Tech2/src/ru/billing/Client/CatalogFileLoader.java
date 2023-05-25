package ru.billing.Client;

import ru.billing.Exception.CatalogLoadException;
import ru.billing.Exception.ItemAlreadyExistsException;
import ru.billing.StockList.FoodItem;
import ru.billing.StockList.ItemCatalog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader{
    private String fileName;
    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        File f = new File(fileName);
        FileInputStream fis;
        String line;
        try {
            fis = new FileInputStream(f);
            Scanner s = new Scanner(fis);

            while(s.hasNextLine()){
                line = s.nextLine();
                if(line.length()==0) break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(0,name,price, LocalDate.now(),expires);
                cat.addItem(item);
            }
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ItemAlreadyExistsException e) {
            throw new RuntimeException(e);
        }

    }
}
