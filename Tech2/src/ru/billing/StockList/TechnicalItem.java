package ru.billing.StockList;

public class TechnicalItem extends GenericItem implements Cloneable
{
    public TechnicalItem(int id, String name, float price, short time) {
        super(id, name, price);
        warrantyTime = time;
    }

    private short warrantyTime;

    public short GetWarTime(){return this.warrantyTime;}
    public void SetWarTime(short time){this.warrantyTime = time;}

    public void ExtendedMethodPrint(){
        PrintAll();
        System.out.printf(" Warranty Time: %d", warrantyTime);
    }

    public boolean equals(Object o)
    {
        if(!(o instanceof TechnicalItem))return false;
        TechnicalItem techItem = (TechnicalItem)o;
        return this.nameOfProduct.equals(techItem.nameOfProduct);
    }

    public Object clone() throws CloneNotSupportedException
    {
        return (TechnicalItem) super.clone();
    }
}
