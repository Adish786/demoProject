package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public abstract class Car {
    private CarType carType;
    private Location location;

    public Car(CarType carType , Location location){
        this.carType=carType;
        this.location=location;
    }
    abstract void construct();
}
