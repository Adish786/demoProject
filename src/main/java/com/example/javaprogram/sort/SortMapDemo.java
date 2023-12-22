package com.example.javaprogram.sort;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("five", 5);
        map.put("ten", 10);
        map.put("two", 2);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        /*
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,Integer> entry:entryList){
            System.out.println(entry.getKey()+"       "+entry.getKey());
        }
         */
        Collections.sort(entryList, ( o1, o2)->o1.getKey().compareTo(o2.getKey()));
        for(Map.Entry<String,Integer> entry:entryList){
            System.out.println(entry.getKey()+"       "+entry.getKey());
        }

      //  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }
}
