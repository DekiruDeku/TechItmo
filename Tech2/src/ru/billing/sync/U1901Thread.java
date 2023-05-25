package ru.billing.sync;

public class U1901Thread extends Thread {
    U1901Bank bankWork;
    int Trans;
    long ingSleep;

    public U1901Thread(U1901Bank bank,int Transition, long sleeptime){
        bankWork = bank;
        Trans = Transition;
        ingSleep = sleeptime;
    }

    public void run(){
        bankWork.calc(Trans,ingSleep);
    }
}
