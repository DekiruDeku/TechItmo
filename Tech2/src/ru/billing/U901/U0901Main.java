package ru.billing.U901;

public class U0901Main {
    public static void main(String[] args){
        Integer intArr[]={10,20,15};
        Float floatArr[] = {0f, 0f, 0f, 0f, 0f};

        for (int i = 0; i<floatArr.length;i++){
        floatArr[i] = (float)Math.round(Math.random()*10);
        }

        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }
}
