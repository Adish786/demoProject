package com.example.program2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TODO Find a Number whose Start with 1
public class FindStartWithNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,10,20,30,70,51,16);
        List<Integer> collect = number.stream().filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
