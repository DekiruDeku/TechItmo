package ru.billing.Client;

import ru.billing.Exception.CatalogLoadException;
import ru.billing.Exception.ItemAlreadyExistsException;
import ru.billing.StockList.FoodItem;
import ru.billing.StockList.GenericItem;
import ru.billing.StockList.ItemCatalog;
import ru.billing.StockList.StockListProject;

import java.time.LocalDate;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV",23000, StockListProject.GENERAL);
        FoodItem item2 = new FoodItem(12,"Bread",1f, LocalDate.now(),(short)10);

        try {
            cat.addItem(item1);
            cat.addItem(item2);
        }
        catch (ItemAlreadyExistsException e) { // TODO Auto-generated catch block
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }

    }
}
