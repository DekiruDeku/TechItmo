package ru.billing.StockList;

public class GenericItem implements Cloneable {

    public GenericItem(int id, String name,float price){
        idOfProduct = id;
        nameOfProduct = name;
        priceOfProduct = price;
        enumOfProduct = StockListProject.GENERAL;
    }

    public GenericItem(String name, float price, StockListProject category){
        nameOfProduct = name;
        priceOfProduct = price;
        enumOfProduct = category;
        this.idOfProduct = GenericItem.currentId++;
    }

    public GenericItem(String name, float price, GenericItem analog){
        nameOfProduct = name;
        priceOfProduct = price;
        enumOfProduct = analog.enumOfProduct;
        this.idOfProduct = GenericItem.currentId++;
    }

    public GenericItem(){
        nameOfProduct = "ERROR";
        priceOfProduct = 0;
        enumOfProduct = StockListProject.GENERAL;
        idOfProduct = 000000;
    }

    protected int idOfProduct;
    protected String nameOfProduct;
    private float priceOfProduct;
    private StockListProject enumOfProduct;

    private static int currentId = 0;

    public int GetId(){return this.idOfProduct;}
    public void SetId(int id){this.idOfProduct = id;}

    public String GetName(){return this.nameOfProduct;}
    public void SetName(String name){this.nameOfProduct = name;}

    public float GetPrice(){return this.priceOfProduct;}
    public void SetPrice(float price){this.priceOfProduct = price;}

    public StockListProject GetCollection(){return this.enumOfProduct;}
    public void SetCollection(StockListProject stockListProject){this.enumOfProduct = stockListProject;}

    public void PrintAll(){
        System.out.printf("ID: %d, Name: %-20s, Price: %5.2f, Collection: %-20s \n",idOfProduct,nameOfProduct,priceOfProduct,enumOfProduct);
    }

    public boolean equals(Object o)
    {
        if(!(o instanceof GenericItem))return false;
        GenericItem genericItem = (GenericItem)o;
        return this.nameOfProduct.equals(genericItem.nameOfProduct);
    }

    public Object clone() throws CloneNotSupportedException
    {
        return (GenericItem) super.clone();
    }
}
