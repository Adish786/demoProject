package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumberOfOccurance {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("honda", "hero", "tvs", "bajaj", "honda");

        //TODO find the occurances
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
        String st = "Adish";
Map<Character,Long> collect2 =  st.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        collect2.forEach((k,v)->System.out.println(k+v));



    }
}
