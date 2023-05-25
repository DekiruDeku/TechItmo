package ru.billing.StockList;

import ru.billing.Exception.CatalogLoadException;
import ru.billing.Exception.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;


public class ItemCatalog {
    private HashMap<Integer,GenericItem> catalog = new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public HashMap GetCatalog(){return this.catalog;}
    public void SetCatalog(HashMap<Integer, GenericItem> mapa){this.catalog = mapa;}

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        if(catalog.containsValue(item))
            throw new ItemAlreadyExistsException();
        catalog.put(item.idOfProduct, item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems(){
        for(GenericItem i : ALCatalog){
            System.out.println(i);
        }
    }

    public GenericItem findItemByIDInHashMap(int id){ //Если нет такого ID, возвращаем пустое значение
        if(!catalog.containsKey(id)) {
            return null;
        }
        else{
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDInArray(int id){
        for(GenericItem i : ALCatalog){
            if(i.idOfProduct==id) return i;
        }
        return null;
    }


}
