package com.example.programs;

import java.util.*;
import java.util.stream.Collectors;

public class StartWithString {
    public static void main(String[] args) {
        //1. Find words starting with A and collect them
        List<String> names = Arrays.asList("Amit", "Sunil", "Anil", "Ramesh", "Vikram");
        List<String> startwithA = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(startwithA);
        for (String name : startwithA) {System.out.println(name);}
        //2. Filter employee and group the based on gender
        List<Employee1> employee1List = new ArrayList<>();
        createEmployeeList(employee1List);
        Map<String, List<Employee1>> getByGender = employee1List.stream()
                .collect(Collectors.groupingBy(Employee1::getGender));
        getByGender.forEach((key, value) -> {System.out.println(key + value);});
        //3. Find duplicate words in a starting with their count
        String input = "Testing program is Testing program";
        Map<String, Integer> out = new HashMap<>();
        String[] inputArray = input.split(" ");
        for (String word : inputArray) {
            Integer oldCount = out.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            out.put(input, oldCount + 1);
        }
        out.forEach((key, value) -> {System.out.println(key + "===" + value);});
        //4. create custom functional interface and use it in main method with lambda expression


    }

    private static void createEmployeeList(List<Employee1> employeeList) {
        employeeList.add(new Employee1(1, "Adish", 20, "Active", "Java", 2022, 3000, "male"));
        employeeList.add(new Employee1(2, "rohit", 20, "Active", "Java", 2022, 3000, "male"));
        employeeList.add(new Employee1(3, "swati", 20, "Active", "Java", 2022, 3000, "female"));
        employeeList.add(new Employee1(4, "sweta", 20, "Active", "Java", 2022, 3000, "female"));
        employeeList.add(new Employee1(5, "anurag", 20, "Active", "Java", 2022, 3000, "male"));
    }

}
