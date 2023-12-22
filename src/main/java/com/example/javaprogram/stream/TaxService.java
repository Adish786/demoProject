package com.example.javaprogram.stream;

import com.example.javaprogram.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static  List<Employee> evaluatetaxusers(String input){

return  (input.equalsIgnoreCase("tax"))
        ? DataBase.getEmployee().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList())
        : DataBase.getEmployee().stream().filter(emp->emp.getSalary()<=50000).collect(Collectors.toList());
      /*
        if(input.equalsIgnoreCase("txt"))
        {
            return DataBase.getEmployee().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
        }
        else {
            return DataBase.getEmployee().stream().filter(emp->emp.getSalary()<=50000).collect(Collectors.toList());
        }
       */
    }
    public static void main(String[] args) {
        System.out.println(evaluatetaxusers("txt"));
    }

}
