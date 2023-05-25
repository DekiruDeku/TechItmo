package ru.billing.Exception;

import ru.billing.StockList.ItemCatalog;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(){
        System.out.println("This item already exist");
    }
}
