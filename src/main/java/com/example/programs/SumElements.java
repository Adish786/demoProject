package com.example.programs;

import java.util.Arrays;

public class SumElements {
    public static void main(String[] args) {

        int[] arrays = {2,3,4,5,7};
        int sum = Arrays.stream(arrays).sum();
        System.out.println(sum);

    }
}
