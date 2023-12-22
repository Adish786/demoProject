package com.example.javaprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StartWith1Integer {
    public static void main(String[] args) {
//TODO a list of integers , find out all the numbers starting with 1 using Stream functions
     //   List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
     //   myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
//TODO given a list of integers sort all the values present in it using Stream functions

       // List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
      //  myList1.stream().sorted().forEach(System.out::println);
//TODO given a list of integer sort all the values present in it in descending order using stream functions

        List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98,98, 32);
        myList2.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
