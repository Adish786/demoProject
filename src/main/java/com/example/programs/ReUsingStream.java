package com.example.programs;

import java.util.function.Supplier;
import java.util.stream.Stream;

//TODO can we Re use a Stream ??
public class ReUsingStream {
    public static void main(String[] args) {
        String[] inputArray = {"Amit", "ball", "call", "Amit", "egg"};
     /*   Stream<String> inputStream = Arrays.asList(inputArray).stream();
        inputStream.forEach(ex -> System.out.println(ex));
        long count =inputStream.filter(x->"Amit".equals(x)).count();
        System.out.println(count);*/

        Supplier<Stream<String>> inputStream = ()->Stream.of(inputArray);
      //  inputStream.get().forEach(ex->System.out.println(ex));
        long count = inputStream.get().filter(x->"Amit".equals(x)).count();
        System.out.println(count);


    }
}
