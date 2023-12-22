package com.example.program2;

public class EvenAndOddPrinterBy2Threads implements Runnable {
    static  int count =1;
    Object object;
    public EvenAndOddPrinterBy2Threads(Object object){
        this.object=object;
    }
    @Override
    public void run() {
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name :- " + Thread.currentThread().getName() + "value : " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {

                synchronized (object) {
                    System.out.println("Thread Name :- " + Thread.currentThread().getName() + "value : " + count);
                    count++;
                    object.notify();
                }
            }

        }
    }

    public static void main(String[] args) {
            Object lock =  new Object();
        Runnable r1 = new EvenAndOddPrinterBy2Threads(lock);
        Runnable r2 = new EvenAndOddPrinterBy2Threads(lock);
            new Thread(r1,"even");
        new Thread(r2,"odd");
    }
}
