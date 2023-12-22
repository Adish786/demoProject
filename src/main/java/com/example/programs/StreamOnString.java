package com.example.programs;

import java.util.Map;
import java.util.stream.Collectors;

/*
Using
Find the vowels count in the String
Find the duplicates in the String
 */
public class StreamOnString {
    public static void main(String[] args) {

        String input = "hello hello";
        //TODO Find the vowels count in the String
        long count = input.chars().filter((x) -> {
            return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
        }).count();
        System.out.println(count);
        //TODO find the duplicate in the String
        Map<String, Long> duplicate = input.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        duplicate.forEach((key, value) -> System.out.println(key + value));

    }

}
