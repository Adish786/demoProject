package com.example.programs;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MinMaxJavaProgram {
    public static void main(String[] args) {
        List<Employee1> employee1s = new ArrayList<>();
        createEmployeeList(employee1s);

//TODO program to print Max/Min employee salary from the given collection
        Optional<Employee1> higeshEmployee = employee1s.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
        if (higeshEmployee.isPresent()) {
             System.out.println("Employee list as max By :" +higeshEmployee);
        }
         else
           System.out.println("Employee are empty");
        //TODO program to print the max salary of an employee from each department
        Map<String, Optional<Employee1>> employewithgigestSalary = employee1s.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee1::getSalary)))));
        employewithgigestSalary.forEach((key, value) -> {
            System.out.println(key + "----" + value);
        });

        //TODO program to print active and incative employee in the given collection
        Map<String, Long> activeInactiveEmployeeList = employee1s.stream()
                .collect(Collectors.groupingBy(Employee1::getActive, Collectors.counting()));
        activeInactiveEmployeeList.forEach((key, value) -> {
            System.out.println(key + value);
        });
        //TODO program to print employee details working in each department
        System.out.println("=====================================");
   Map<String,List<Employee1>>   empDepetCount=  employee1s.stream()
           .collect(Collectors.groupingBy(Employee1::getDepartment));
        empDepetCount.forEach((key,value)->{
            System.out.println(key+value);
        });

        //TODO tp print employee count working in each department


    }


    private static void createEmployeeList(List<Employee1> employees) {
        Employee1 e1 = new Employee1(1, "Adish", 20, "Active", "Java", 2022, 3000,"male");
        Employee1 e2 = new Employee1(2, "Amit", 25, "Active", "UI", 2012, 4000,"male");
        Employee1 e3 = new Employee1(3, "anurag", 30, "InActive", "SQL", 2032, 2000,"female");
        Employee1 e4 = new Employee1(4, "Saurabh", 40, "Active", "Angular", 2052, 6000,"female");
        Employee1 e5 = new Employee1(5, "Vikash", 50, "InActive", "Cloud", 2062, 8000,"male");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

    }
}
