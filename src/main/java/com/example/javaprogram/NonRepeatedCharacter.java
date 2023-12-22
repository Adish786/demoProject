package com.example.javaprogram;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
public class NonRepeatedCharacter {
    public static void main(String[] args) {

        //TODO given a String , find the first non-repeated character in it using Stream function

        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();
        System.out.println(result);


    //TODO given a String ,find the first repeated character in it using stream functions

        String input1 = "Java Hungry Blog Alive is Awesome";

    Character results = input1.chars()
            .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
            .entrySet().stream().filter(entry->entry.getValue()>1L).map(entry->entry.getKey())
            .findFirst().get();
    System.out.println(results);





    }
}
