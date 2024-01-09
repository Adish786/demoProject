package com.example.program2;

import java.util.Vector;

public class FindPairsOfPossitiveAndNegativeNumber {
    public static void main(String[] args) {
        int arr[] = { 1, -3, 2, 3, 6, -1 };
        int n = arr.length;
        printPairs(arr, n);
    }
    public static void printPairs(int arr[], int n)
    {
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs(arr[i]) == Math.abs(arr[j])) v.add(Math.abs(arr[i]));
        if (v.size() == 0)
            return;
        for (int i = 0; i < v.size(); i++)
            System.out.print(-v.get(i) + " " + v.get(i) + " ");
    }
}
