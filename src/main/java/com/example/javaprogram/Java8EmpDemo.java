package com.example.javaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Adish,", "DEV", 500));
        employeeList.add(new Employee(2, "Saadfdf,", "DEV", 1000));
        employeeList.add(new Employee(3, "Afish,", "DEV", 1500));
        employeeList.add(new Employee(4, "Adfddish,", "DEV", 2000));
        employeeList.add(new Employee(5, "Ah,", "DEV", 5000));
        employeeList.add(new Employee(6, "Aish,", "DEV", 7000));
        employeeList.add(new Employee(7, "Adish,", "DEV", 8050));
        employeeList.add(new Employee(8, "dish,", "DEV", 12000));
        employeeList.add(new Employee(9, "Adsh,", "DEV", 5400));
        List<Employee> collect = employeeList.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
        System.out.println(collect);

         List<Employee>  employees=       employeeList.stream().sorted((e1,e2)->(e2.getSalary()-e1.getSalary())).skip(1).collect(Collectors.toList());
 System.out.println(employees);



    }


}
