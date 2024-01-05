package com.example.demo2;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<Iteam> iteams = new ArrayList<>();
        iteams.add(new Iteam("Dom", "Mona", 120.0));
        iteams.add(new Iteam("Jhon", "Charlie", 150.0));
        iteams.add(new Iteam("Bob", "Reha", 210.0));
        iteams.add(new Iteam("Jhon", "Mona", 150.0));

        Map<Double, DoubleSummaryStatistics> collect = iteams.stream().filter(i -> i.getName() != null && i.getPay() != null)
                .collect(Collectors.groupingBy
                        (Iteam::getAmout, Collectors.summarizingDouble(Iteam::getAmout)));
        System.out.println(collect);

    }




}
