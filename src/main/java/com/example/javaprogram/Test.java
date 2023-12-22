package com.example.javaprogram;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String arg[]) {
        Function<Integer, String> function = (t) -> "Output" + t;
        System.out.println(function.apply(88));
        List<Integer> list = Arrays.asList(12, 3, 4, 6, 8, 9, 156);
        //  list.stream().filter(t -> t > 4).sorted().forEach(System.out::println);
        //  list.stream().filter(t->t%2!=0).sorted().forEach(Test::printElement);  //Static Method Refrance
        Test test = new Test();
        list.stream().filter(t -> t > 4).sorted().forEach(test::printElement);  //Instance Method Referance

        List<User> users = Stream.of(
                        new User("user1", "1223242", Arrays.asList("abc@gmail.com", "def@gmail.com")),
                        new User("user2", "190877665", Arrays.asList("abc@gmail.com", "def@gmail.com")))
                .collect(Collectors.toList());
        // List<String> phoneNumber = users.stream().map(User::getPhone).collect(Collectors.toList());
        // System.out.println(phoneNumber);

        //  List<List<String>> email = users.stream().map(User::getEmail).collect(Collectors.toList());
        // System.out.println(email);

        List<String> listofString = users.stream().flatMap(u -> u.getEmail().stream())
                .collect(Collectors.toList());
        System.out.println(listofString);
        //TODO Wap using stream to find frequency of each character in a given string ?
        String input = "AdishAnsari";
        Map<String, Long> stringLongMap = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);

        //TODO Assume you have list of employee in various dept , wap to find highest paid  employee from each dept ?

        List<Employee> employees = Stream.of(
                new Employee(1, "Basant", "Dev", 50000),
                new Employee(8, "Santosh", "Dev", 80000),
                new Employee(3, "pratik", "QA", 60000),
                new Employee(9, "Dipak", "QA", 90000),
                new Employee(4, "Bikash", "DEVOPS", 40000)).collect(Collectors.toList());
        //Approch 1
        //Comparator<Employee> comparingSalary = Comparator.comparing(Employee::getSalary);
        // Map<String ,Optional<Employee>> employeeMap=  employees.stream()
        // .collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.reducing(BinaryOperator.maxBy(comparingSalary))));
        //  System.out.println(employeeMap);

        //Approch 2
        //Map<String, Employee> comparingSalary1 = employees.stream()
        // .collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
        // Optional::get)));
        //System.out.println(comparingSalary1);

        IntStream.rangeClosed(1,10).forEach(t->System.out.println(Thread.currentThread().getName()+t));
        System.out.println("===================================");
        IntStream.rangeClosed(1,10).parallel().forEach(t->System.out.println(Thread.currentThread().getName()+t));

    }

    // public static void  printElement(int i){System.out.println(i);}  //This is Static Method
    public void printElement(int i) {System.out.println(i);}


}
