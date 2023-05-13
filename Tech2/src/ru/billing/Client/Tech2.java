package ru.billing.Client;

import ru.billing.StockList.FoodItem;
import ru.billing.StockList.GenericItem;
import ru.billing.StockList.ItemCatalog;
import ru.billing.StockList.TechnicalItem;

import java.time.LocalDate;
import java.util.Date;

public class Tech2 {

    public static void main(String[]args)
    {
        GenericItem genericItem1 = new GenericItem(123, "Соль", 12);
        GenericItem genericItem2 = new GenericItem(231, "Сахар", 8);
        GenericItem genericItem3 = new GenericItem(312, "Перец", 5);
        genericItem1.PrintAll();
        genericItem2.PrintAll();
        genericItem3.PrintAll();

        FoodItem foodItem = new FoodItem(1234, "Ложка", 25F,LocalDate.now(), (short) 12);
        TechnicalItem technicalItem = new TechnicalItem(4321, "Вилка", 23F, (short) 10);

        GenericItem[] mass = new GenericItem[] {foodItem, technicalItem};
        for (int i = 0;i< mass.length;i++){
            mass[i].PrintAll(); //апкаст
        }

        FoodItem foodItem2 = new FoodItem(3253, "Нож", 13F,LocalDate.now(), (short) 11);

        System.out.println(foodItem2.equals(foodItem));

        FoodItem foodItem3;
        try {
            foodItem3 = (FoodItem) foodItem2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(foodItem3.equals(foodItem2));

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem foodItem30 = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItem30.PrintAll();

        GenericItem genericItem4 = new GenericItem(41324, "Макароны", 55);
        GenericItem genericItem5 = new GenericItem(12343, "Картофель", 76);
        ItemCatalog itemCatalog = new ItemCatalog();

        itemCatalog.addItem(genericItem1);
        itemCatalog.addItem(genericItem2);
        itemCatalog.addItem(genericItem2);
        itemCatalog.addItem(foodItem);
        itemCatalog.addItem(technicalItem);
        itemCatalog.addItem(foodItem2);
        itemCatalog.addItem(foodItem3);
        itemCatalog.addItem(foodItem30);
        itemCatalog.addItem(genericItem4);
        itemCatalog.addItem(genericItem5);

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);

        long begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIDInHashMap(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIDInArray(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

    }

}
