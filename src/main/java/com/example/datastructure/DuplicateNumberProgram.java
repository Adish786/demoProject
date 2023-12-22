package com.example.datastructure;

import java.util.List;
import java.util.ArrayList;
/*
TODO Find out Duplicate number between 1 to N Numbers
   */
public class DuplicateNumberProgram {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i < 40; i++) {
            numbers.add(i);
        }
        // adding duplicate number into the list
        numbers.add(35);
        DuplicateNumberProgram obj = new DuplicateNumberProgram();
        int duplicateNumber = obj.getDuplicateNumber(numbers);
        System.out.println(duplicateNumber);
    }
    public int findSum(List<Integer> numbers) {
        int sum =0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public int getDuplicateNumber(List<Integer> numbers) {
        int n = numbers.size()-1;
        int total = findSum(numbers);
        int duplicateNum = total - (n * (n+1)/2);
        return duplicateNum;
    }
}