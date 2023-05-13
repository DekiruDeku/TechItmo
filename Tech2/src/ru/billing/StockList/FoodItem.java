package ru.billing.StockList;

import java.time.LocalDate;

public class FoodItem extends GenericItem implements Cloneable
{
    private LocalDate dateOfIncome;
    private short expires;

    public LocalDate GetDate(){return this.dateOfIncome;}
    public void SetDate(LocalDate date){this.dateOfIncome = date;}

    public short GetExpires(){return this.expires;}
    public void SetExpires(short exp){this.expires = exp;}

    public FoodItem(int id, String name, float price, LocalDate somedate, short someexpires) {
        super(id, name, price);
        dateOfIncome = somedate;
        expires = someexpires;
    }

    public FoodItem(String name, float price, short expires){
       this(12312,name,price,LocalDate.now(),expires);
    }
    public FoodItem(String name){
        this(12312,name, (float) 0,LocalDate.now(), (short) 1);
    }

    public void ExtendedMethodPrint()
    {
        PrintAll();
        System.out.printf(" Date of Income: %d, Expires: %d",dateOfIncome,expires);
    }
    public boolean equals(Object o)
    {
        if(!(o instanceof FoodItem))return false;
        FoodItem foodItem = (FoodItem)o;
        return this.nameOfProduct.equals(foodItem.nameOfProduct);
    }
    public Object clone() throws CloneNotSupportedException
    {
        return (FoodItem) super.clone();
    }
}
