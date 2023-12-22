package com.example.LLD.WithStrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveObj){
        this.driveStrategy=driveObj;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
