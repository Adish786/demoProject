package com.example.LLD.WithStrategyDesignPattern;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SportDriveStrategy());
    }
}
