package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
Input  = Hello How are you
Output = [Hello-How-are-you]
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        String input = "Hello How are you ";
        String[] inputArray = input.split(" ");
        StringJoiner joiner = new StringJoiner("-", "[", "]");
        for (String inputArr : inputArray) {
            joiner.add(inputArr);
        }
        System.out.println(joiner);
        List<String> inputList = Arrays.asList("Hello", "How", "are", "you");
        String output = inputList.stream().collect(Collectors.joining("-"));
        System.out.println(output);
    }
}
