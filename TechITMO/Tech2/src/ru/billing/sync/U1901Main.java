package ru.billing.sync;

public class U1901Main {

    public static void main(String[] args) {
        U1901Bank bankMain = new U1901Bank();
        U1901Thread threadOne = new U1901Thread(bankMain, 100,2000);

        threadOne.setName("The first THREAD");
        threadOne.setPriority(Thread.MAX_PRIORITY);

        threadOne.start();

        U1901Thread threadTwo = new U1901Thread(bankMain, 50,300);
        U1901Thread threadThree = new U1901Thread(bankMain, 50,300);
        U1901Thread threadFour = new U1901Thread(bankMain, 50,300);

        threadTwo.setName("The second THREAD");
        threadThree.setName("The three THREAD");
        threadFour.setName("The four THREAD");

        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadThree.setPriority(Thread.MAX_PRIORITY);
        threadFour.setPriority(Thread.MAX_PRIORITY);

        threadTwo.start();
        threadThree.start();
        threadFour.start();

        Thread.currentThread().getName();


    }
}
