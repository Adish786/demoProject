package com.example.program2;

import java.util.*;
//TODO Count the Dubpicate Friquency
// 22, 56, 88, 95, 88, 45, 20, 22, 20
// Output 20: 2  22: 2  56: 1  88: 2  45: 1 95: 1
public class CountDuplicateFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22, 56, 88, 95, 88, 45, 20, 22, 20);
        System.out.println("Count all with frequency");
        Set<Integer> set = new HashSet<>(list);
        for (Integer r : set) {
            System.out.println(r + ": " + Collections.frequency(list, r));
        }
    }
}
