package com.example.program2;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddNumber {
    private static Object object=  new Object();
    private static IntPredicate oddCondition = e->e%2!=0;
    private static IntPredicate evenCondition = e->e%2==0;

    public static  void printResults(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition).forEach(EvenOddNumber::execute);
    }


    public static void  execute(int i)  {
        synchronized (object){
            System.out.println("Thread Name :- " + Thread.currentThread().getName() + "value : " + i);
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->EvenOddNumber.printResults(oddCondition));
        CompletableFuture.runAsync(()->EvenOddNumber.printResults(evenCondition));
        Thread.sleep(1000);
    }

}
