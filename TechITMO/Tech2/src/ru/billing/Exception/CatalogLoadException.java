package ru.billing.Exception;

import ru.billing.Client.CatalogLoader;
import ru.billing.StockList.ItemCatalog;

public class CatalogLoadException extends Exception{

    public CatalogLoadException(ItemAlreadyExistsException e) {
        System.out.println("This item already exist");
    }

    public void load(){

    }


}
