package ru.billing.sync;

public class U1901Bank {
    int intTo = 10; // кредит
    int intFrom = 220; // дебит

    public synchronized void calc(int intTransaction, long ingTimeout){
        System.out.println("Before ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("На кредитном счете: " + intTo);
        System.out.println("На дебитовом счете: " + intFrom);
        intFrom -= intTransaction;
        try {
            Thread.sleep(ingTimeout);
        }
        catch (Exception any){}
        intTo += intTransaction;

        System.out.println("After ");
        System.out.println(Thread.currentThread().getName());
        System.out.println("На кредитном счете: " + intTo);
        System.out.println("На дебитовом счете: " + intFrom);

    }
}
