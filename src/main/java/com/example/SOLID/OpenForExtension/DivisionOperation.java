package com.example.SOLID.OpenForExtension;

public class DivisionOperation implements  Operation{
    @Override
    public double calculate(double a1, double a2) {
        return a1/a2;
    }
}
