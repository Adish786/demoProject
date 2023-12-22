package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingStream {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 5};   //120
        List<Integer> numberList = Arrays.asList(inputArray);
        Optional<Integer> reduce = numberList.stream().reduce((a, b) -> a * b);
        if (reduce.isPresent()) {
            System.out.println("Arrays Multiplication using java 8 " + reduce.get());
        } else {
            System.out.println("Arrays is Empty" + reduce.get());
        }
        Integer foreachoutput = 0;
        for (Integer num : numberList) {
            foreachoutput *= num;
        }
        System.out.println(foreachoutput);


    }
}
