package com.example.javaprogram.sort;

import com.example.javaprogram.Employee;
import com.example.javaprogram.stream.DataBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(7);

        Collections.sort(list);  //ASSENDING
        Collections.reverse(list);
        System.out.println(list);
        list.stream().sorted().forEach(s -> System.out.println(s));  //Descending
        List<Employee> employeeList = DataBase.getEmployee();
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        //  System.out.println(employeeList);
        //  employeeList.stream().sorted((o1, o2) -> (o2.getSalary() - o1.getSalary())).forEach(System.out::println);
//        employeeList.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
        //  employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }

    public static List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 60000));
        list.add(new Employee(388, "Bikash", "CIVIL", 90000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 50000));
        list.add(new Employee(624, "Sourav", "CORE", 40000));
        list.add(new Employee(176, "Prakash", "SOCIAL", 120000));
        return list;
    }

}

class MyComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();  //ascending
    }
}