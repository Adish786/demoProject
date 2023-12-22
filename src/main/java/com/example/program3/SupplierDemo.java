package com.example.program3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//TODO orElseGet() method are Supplier if Arrays.asList() is empty() then orElseGet() method are called and return the message of supplier

public class SupplierDemo {
    /*@Override
    public String get() {
        return "Hi Java Coder";
    }
*/
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi Java Coder";
        //  System.out.println(supplier.get());
        List<String> list1 = Arrays.asList();
        //  String s = list1.stream().findAny().orElseGet(supplier);
        String s = list1.stream().findAny().orElseGet(() -> "Hi viewers");
        System.out.println(s);
    }
}
