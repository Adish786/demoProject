package com.example.SOLID.LiskovSubstitution.Solution;

public class Car implements VehicleWithEngine{
    @Override
    public void startEngine() {
System.out.println("Start the enginee");
    }
}
