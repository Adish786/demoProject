package com.example.javaprogram.sort;

import com.example.programs.Employee;

import java.util.*;

public class SortedTreemapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("five", 5);
        map.put("ten", 10);
        map.put("two", 2);
        Map<Employee,Integer> employeeIntegerMap = new TreeMap<>();



        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList,(o1,o2)->(o1.getKey().compareTo(o2.getKey())));

    }
}
