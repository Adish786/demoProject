package com.example.executerService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/*
class Service implements Runnable{
    int i;public Service(int i){this.i=i;}
    @Override
    public void run() {
        System.out.println("In Thread  "+i);
        try {Thread.sleep(1000);} catch (InterruptedException e) {
            throw new RuntimeException(e);}}
}

 */
class Service implements Callable<String>{
    int i;
    public Service(int i){this.i=i;}

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        System.out.println("In Thread  "+i);
        return "from thread " +i;
    }
}
public class ExecutorUtility {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
      //  List<Future<String>> futuresList = new ArrayList<>();
        List<Callable<String>> callableList = new ArrayList<>();
       /*
        for(int i =0;i<10;i++)
        {
            //es.execute(new Service(i));
          //  futuresList.add((Future<String>) es.submit(new Service(i)));  //With Runnable
            futuresList.add(es.submit(new Service(i)));
        }

        */

        callableList.add(new Service(1));
        callableList.add(new Service(2));
        callableList.add(new Service(3));
        callableList.add(new Service(4));
        callableList.add(new Service(5));
        String  str = es.invokeAny(callableList);  //it return only one future data and it can be any from the list of data

        List<Future<String>> futureList = es.invokeAll(callableList);

      //  es.invokeAny(futuresList);   //only invoke one thread
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS); //wait till here
        System.out.println("===========================");
        System.out.println(str);
        for(Future<String> fut : futureList)
            System.out.println(fut.get()); //Null in case of Runnable
        System.out.println(new Date());
    }
}
