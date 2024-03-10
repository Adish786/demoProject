package com.example.program2;



import com.example.programs4.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRelatedQuestions {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Adish",22,"Male","IT",2022,22000.00));
        employees.add(new Employee(2,"Rohit",23,"Male","CSE",2002,35000));
        employees.add(new Employee(3,"Amit",24,"Male","EE",2001,10000.00));
        employees.add(new Employee(4,"Akash",25,"Male","ME",2012,25000.00));
        employees.add(new Employee(5,"Rohini",32,"Female","EC",2024,45000.00));
        employees.add(new Employee(6,"Qamar",42,"Male","HR",2017,30000.00));
        //Get EmployeeName And Employee Age
        Map<String,Integer> namePercentageMap = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println(namePercentageMap);
        //String delimiter Jonning
        String namesJoined = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(namesJoined);
        //Get Max Age in Employee
        Optional<Integer> highPercentage = employees.stream().map(Employee::getAge).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(highPercentage);
        //Get Max Age in Employee
        Optional<Integer> highAge = employees.stream().map(Employee::getAge).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(highAge);
        //Get Min Age in Employee
        Optional<Integer> minhAge = employees.stream().map(Employee::getAge).collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(minhAge);
        Double sumOfAge = employees.stream().collect(Collectors.summingDouble(Employee::getAge));
        System.out.println(sumOfAge);
        Double avgOfAge = employees.stream().collect(Collectors.averagingInt(Employee::getAge));
        System.out.println(avgOfAge);
        DoubleSummaryStatistics studentStats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Highest Percentage : "+studentStats.getMax());
        System.out.println("Lowest Percentage : "+studentStats.getMin());
        System.out.println("Average Percentage : "+studentStats.getAverage());

    }
}
