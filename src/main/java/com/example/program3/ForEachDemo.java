package com.example.program3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    // filter()  ----->  conditional check
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adish");
        list.add("Murrit");
        list.add("john");
        list.add("marek");
        list.add("mac");
        for (String s : list) {
            System.out.println(s);
        }
        list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

        list.stream().forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.forEach((key, value) -> System.out.println(key + "==" + value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));
        Consumer<String> consumer = (t) -> System.out.println(t);
        consumer.accept("Java Coder");

        //TODO What will be the output of the following program ?
        String name = "JavaCoder".substring(4);
        System.out.println(name);
    }
}
