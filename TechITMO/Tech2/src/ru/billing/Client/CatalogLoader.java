package ru.billing.Client;

import ru.billing.Exception.CatalogLoadException;
import ru.billing.StockList.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException;

}
