package com.example.demo2;

import com.example.programs.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Demo {
    public static void main(String[] args) {
       String str =  "Adish Ansari";

   //     List<String> collect = Arrays.stream(str.split("")).filter(s -> s.startsWith("@&123#")).collect(Collectors.toList());
   // System.out.println(collect);
       // Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       /// System.out.println(collect);
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "Hello";
        System.out.println("s1 == s2:" + (s1 == s2)); //false
        System.out.println("s1 == s3:" + (s1 == s3)); //ture
        System.out.println("s1.equals(s2):" + s1.equals(s2)); // true
       //What is the output
        // System.out.println(this); // this' cannot be referenced from a static context
    }

}
