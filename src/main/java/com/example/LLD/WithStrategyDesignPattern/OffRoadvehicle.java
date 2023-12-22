package com.example.LLD.WithStrategyDesignPattern;

public class OffRoadvehicle extends Vehicle{
    OffRoadvehicle() {
        super(new SportDriveStrategy());
    }
}
