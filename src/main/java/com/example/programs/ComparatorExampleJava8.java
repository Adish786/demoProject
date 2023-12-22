package com.example.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Future;

//TODO Sort Employee using comparator in java 8   or How comparator can be used in java 8
public class ComparatorExampleJava8 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        createEmployeeList(employeeList);
        System.out.println("Employee List before sorting");
        employeeList.forEach(emp -> System.out.println(emp.getName() + "---" + emp.getCity()));
        System.out.println("Employee List After sorting");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(emp -> System.out.println(emp.getName() + "--" + emp.getCity()));

        System.out.println("Employee List After reverse sorting");
        employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(emp -> System.out.println(emp.getName() + "----" + emp.getCity()));

        Comparator<Employee> groupbyComparator = Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getCity);
        System.out.println("========");
        employeeList.sort(groupbyComparator);
        System.out.println("Employee List After groupBy sorting");
        employeeList.forEach(emp->System.out.println(emp.getName()+"--"+emp.getCity()));



    }


    private static void createEmployeeList(List<Employee> employees) {
        Employee e1 = new Employee();
        e1.setName("Arun");
        e1.setCity("Pune");
        e1.setId("1");
        Employee e2 = new Employee();
        e2.setName("Adish");
        e2.setCity("Bang");
        e2.setId("2");

        Employee e3 = new Employee();
        e3.setName("Saurabh");
        e3.setCity("Mp");
        e3.setId("3");

        Employee e4 = new Employee();
        e4.setName("Amresh");
        e4.setCity("Delhi");
        e4.setId("4");
        Employee e5 = new Employee();
        e5.setName("Anurag");
        e5.setCity("Hyd");
        e5.setId("5");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

    }
}
