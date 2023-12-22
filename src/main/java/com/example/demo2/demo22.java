package com.example.demo2;

import java.util.ArrayList;
import java.util.Arrays;

public class demo22 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,-6,7,-8,9,10};
            removeNegative(a);
        Arrays.stream(a).filter(e->e%2==0).forEach(System.out::println);
    }

    // Function to remove the negative elements
    static void removeNegative(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int x : arr) {
            if (x >= 0) {
                newArr.add(x);
            }
        }
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
