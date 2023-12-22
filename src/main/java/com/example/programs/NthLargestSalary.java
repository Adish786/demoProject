package com.example.programs;

import java.util.*;
import java.util.stream.Collectors;

public class NthLargestSalary {

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(25000, 45000, 78000, 15000, 35000);
        Optional<Integer> first = items.stream().sorted((x, y) -> x - y).skip(1).findFirst();
        System.out.println(first);
        List<Employee1> employee1List = new ArrayList<>();
        createEmployeeList(employee1List);
        //TODO Find Second largest salary
        Employee1 employee1 = employee1List.stream()
                .sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).skip(1).findFirst().get();
        System.out.println(employee1);
        //TODO find Second largest salary Approch 2
        Employee1 employee11 = employee1List.stream()
                .sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(employee11);

        Double highestSalary = employee1List.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder())
                //.skip(2)
                .findFirst().get();
        System.out.println(highestSalary);
        Comparator<Double> comparator = (x, y) -> Double.compare(x, y);
        Double higestSalary = employee1List.stream().map(x -> x.getSalary())
                .collect(Collectors.maxBy(comparator)).get();
        System.out.println(higestSalary);
        Map<String, Long> noOfMF = employee1List.stream()
                .collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        noOfMF.forEach((k,v)->{System.out.println(k+"=="+v);});
    }

    private static void createEmployeeList(List<Employee1> employeeList) {
        employeeList.add(new Employee1(1, "Adish", 20, "Active", "Java", 2022, 13000, "male"));
        employeeList.add(new Employee1(2, "rohit", 20, "Active", "Java", 2022, 23000, "male"));
        employeeList.add(new Employee1(3, "swati", 20, "Active", "Java", 2022, 53000, "female"));
        employeeList.add(new Employee1(4, "sweta", 20, "Active", "Java", 2022, 34000, "female"));
        employeeList.add(new Employee1(5, "anurag", 20, "Active", "Java", 2022, 20000, "male"));
    }
}
