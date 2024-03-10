package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class MicroCar extends Car{
    MicroCar(Location location){
        super(CarType.MICRO,location);
        construct();
    }
    @Override
    void construct() {
        System.out.println("This is Micro Car");
    }
}
