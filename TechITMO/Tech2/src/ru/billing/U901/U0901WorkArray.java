package ru.billing.U901;

public class U0901WorkArray<T extends Number> {
    public U0901WorkArray(T[] numP){
        arrNums = numP;
    }
    public T[] arrNums;

    public double sum(){
        double doubleWork = 0;
        for (T element : arrNums){
            doubleWork += element.doubleValue();
        }
        return doubleWork;
    }
}
