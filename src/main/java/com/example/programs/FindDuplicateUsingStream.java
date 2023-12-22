package com.example.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*

Find no of times a word/ number got repeated
input :- 5,3,4,1,3,7,2,9,9,4
output:- 1-1,2-1,3-2,4-2,5-1,7-1,9-2

input :- "Amanda","Rob","Sunny","Amanda","Rob";
output:- Rob-2,sunny-1,Amanda-2

 */
public class FindDuplicateUsingStream {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        List<String> stringList = Arrays.asList("Amanda", "Rob", "Sunny", "Amanda", "Rob");


        Map<Integer, Long> output = numList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output.forEach((key, value) -> {
            System.out.println(key + value);
        });

        Map<String, Long> output2 = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output2.forEach((key, value) -> {
            System.out.println(key + value);
        });
        //TODO sum of  int array
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
       // System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());
    }
}
