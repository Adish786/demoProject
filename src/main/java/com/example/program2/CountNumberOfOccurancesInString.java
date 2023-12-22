package com.example.program2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountNumberOfOccurancesInString {
    public static void main(String[] args) {
        String input = "ilovejavacoding";
        //TODO count number of occutrances a string
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
        //TODO find all duplicate element from a given string
        List<String> duplicateString = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateString);
        //TODO find the uniqueElement in a string array
        List<String> uniqueString = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(uniqueString);

        //TODO find first non-repeat element from a given string

        String firstNonRepeatelement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeatelement);
        //TODO find second highest number from given array
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        Integer secondHigest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHigest);

        //TODO program to find longest string from given array
        String[] strArray = {"java", "springboot", "microservice", "cloud"};
        String longestString = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
        int[] startwithnumbers = {5,9,11,2,8,21,1,29};
        List<String> collect1 = Arrays.stream(startwithnumbers).boxed()
                .map(s -> s + "").filter(s -> s.startsWith("2")).collect(Collectors.toList());
        System.out.println(collect1);

        //TODO string.join method
        List<String> stringJoin = Arrays.asList("1","2","4","6","9");
        String results = String.join("-",stringJoin);
        System.out.println(results);

        //TODO skip & limit example
        IntStream.range(1,10).skip(1).limit(8).forEach(System.out::println);





    }
}
