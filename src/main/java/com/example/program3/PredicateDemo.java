package com.example.program3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TODO filter() method are we can say Predicate Method because filter are accepting conditional base true or false

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(9));

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
