package com.example.LLD.WithStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
      //  Vehicle vehicle = new SportVehicle();
        Vehicle vehicle = new OffRoadvehicle();
        vehicle.drive();
    }
}
