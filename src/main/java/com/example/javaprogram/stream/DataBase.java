package com.example.javaprogram.stream;

import com.example.javaprogram.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
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
