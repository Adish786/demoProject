package com.example.javaprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomNumber {
    public static void main(String[] args) {

//TODO random numbers using for Each
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
//TODO iterate a stream using the forEach method
        List<String> str = Arrays.asList("Hello","Intervews","Questions","Answer");
        str.stream().forEach(System.out::println);
        //TODO find the minimum number of a Stream
        Integer min = Stream.of(1,2,3,4,5,7,6,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The Minimum number is :" +min );

        //TODO find the maximum number of a Stream
        Integer max = Stream.of(2,4,5,3,21,45,3,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        //TODO count String wose length is greater than 3 in list

        List<String> stringList = Arrays.asList("Hello","Intervew","Question","Answer","Ram","for");

       long count = stringList.stream().filter(string->string.length()>3).count();
        System.out.println("String count with greater than 3 digit :" +count);

    }
}
