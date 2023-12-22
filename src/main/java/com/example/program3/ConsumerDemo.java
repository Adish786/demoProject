package com.example.program3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//TODO forEach() method can accept the data and its Consumer functional Interface
public class ConsumerDemo {

    public static void main(String[] args) {
       // Consumer<Integer> consumer =;
       // consumer.accept(10);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list1.stream().forEach( t -> System.out.println("Printing :" + t));

    }
}
