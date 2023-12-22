package com.example.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Intervew {
    public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
        credateEmployeeList(employees);
       Map<String ,List<Employee>> employ= employees.stream().collect(Collectors.groupingBy(Employee::getCity));
       employ.forEach((key,Value)->System.out.println("City :" +key+ "Employee " +Value));
    }

    private static void credateEmployeeList(List<Employee> employees)
    {
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
