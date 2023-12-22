package com.example.executerService;

import java.util.concurrent.*;


class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {return "Task executed in callable ";}
}

public class FutureImplementations {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
  //     Future<String> future = es.submit(new MyCallable());
    //   System.out.println(future.get());

        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
        es.submit(futureTask);
        System.out.println(futureTask.isDone() +"  "+futureTask.get());
    }
}
