package com.example.javaprogram;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
//TODO given a list of Integers ,find out all the even numbers exist in the list using stream functions
        List<Integer> myList = Arrays.asList(10,15,8,9,37,25,32);
        myList.stream().filter(a->a%2==0).forEach(System.out::println);


    }
}
