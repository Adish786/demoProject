package com.example.program3;

import java.util.function.Function;

//TODO apply() method is a part of Function interface
public class FunctionDemo {
    public static void main(String[] args) {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        // Now treble the output of half function
        half = half.andThen(a -> 3 * a);
        // Applying the function to get the result
        // and printing on console
        System.out.println(half.apply(10));
    }
}
