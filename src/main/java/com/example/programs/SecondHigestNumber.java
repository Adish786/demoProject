package com.example.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an Employee list sort employees based on their salaries in desc order
Fetch top 3 salaried employees details
Fetch all employees having salary less than 3rd highest salary

 */
public class SecondHigestNumber {
    public static void main(String[] args) {

        Integer arr[] = {12, 16, 45, 11, 18, 22, 19, 20, 45};
        Integer result = Arrays.stream(arr).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Higest Number is : " + result);
        List<Employee1> employee1List = new ArrayList<>();
        createEmployeeList(employee1List);
        //TODO given an employee list sort employee based on their salaries in desc order
        List<Employee1> emplSortedList = employee1List.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        System.out.println(emplSortedList);
        //TODO Fetch top 3 salaried employees details
        List<Employee1> employeeTop3 = emplSortedList.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(3).collect(Collectors.toList());
        System.out.println(employeeTop3);
        //TODO Fetch all employees having salary less than 3rd highest salary
        List<Employee1> employee1Top3Less = employee1List.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .skip(3).collect(Collectors.toList());
        System.out.println(employee1Top3Less);
    }


    private static void createEmployeeList(List<Employee1> employeeList) {
        employeeList.add(new Employee1(1, "Adish", 20, "Active", "Java", 2022, 13000, "male"));
        employeeList.add(new Employee1(2, "rohit", 20, "Active", "Java", 2022, 23000, "male"));
        employeeList.add(new Employee1(3, "swati", 20, "Active", "Java", 2022, 53000, "female"));
        employeeList.add(new Employee1(4, "sweta", 20, "Active", "Java", 2022, 34000, "female"));
        employeeList.add(new Employee1(5, "anurag", 20, "Active", "Java", 2022, 20000, "male"));
    }
}
