package com.example.program2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

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
         //   Object lock =  new Object();
      //  Runnable r1 = new EvenAndOddPrinterBy2Threads(lock);
      //  Runnable r2 = new EvenAndOddPrinterBy2Threads(lock);
         //   new Thread(r1,"even");
          //  new Thread(r2,"odd");
        //Second Approch
        ExecutorService executor = Executors.newFixedThreadPool(2);
        IntStream.rangeClosed(1,10).forEach(
                num->{
                    CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num).thenApplyAsync(x->{
                        if(x%2!=0){
                            System.out.println("Threan Name "+Thread.currentThread().getName()+"The value is "+x);
                        }
                        return num;
                    },executor);
                    oddCompletableFuture.join();
                    CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num).thenApplyAsync(x->{
                        if(x%2==0){
                            System.out.println("Threan Name "+Thread.currentThread().getName()+"The value is "+x);
                        }
                        return num;
                    },executor);
                    evenCompletableFuture.join();
                });
        executor.shutdown();

    }
}
