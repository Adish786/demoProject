package com.example.javaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementInteger {
    public static void main(String[] args) {

        //TODO How to find duplicate elements in a given integers list in java using Stream functions
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
       //TODO given the list of integers find the first element of the list using stream functions

        List<Integer> myListfist = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myListfist.stream().findFirst().ifPresent(System.out::println);

        //TODO given a list of integers find the total number of elements preasent
        // in the list using stream function

        List<Integer> myListTotal = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long count = myListTotal.stream().count();
        System.out.println(count);

        //TODO given a list of integer find the maximum value element present in it using stream function;
        List<Integer> myListMax = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        int max = myListMax.stream().max(Integer::compare).get();
        System.out.println(max);



    }
}
