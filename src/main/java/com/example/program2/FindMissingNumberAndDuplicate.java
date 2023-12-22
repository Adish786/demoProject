package com.example.program2;

import java.util.Arrays;

/*
You have a set of integers S,
which originally contains all the numbers from 1 to n.
Unfortunately, due to some error,
one of the numbers in S got duplicated to another number in the set,
which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
        Example 1:
        Input:nums=[4,2,1,2]
        Output:[2,3]
        Example 2:
        Input:nums=[1,1]
        Output:[1,2]

 */
public class FindMissingNumberAndDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,1};
        int n = arr.length;
        printTowElement(arr, n);
    }
    public static void printTowElement(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println("The repeating element is ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
        System.out.println("and the missing number is ");
        for (int i = 1; i <= n; i++) {
            if (i != arr[i - 1]) {
                System.out.println(i);
                break;
            }
        }
    }
}
