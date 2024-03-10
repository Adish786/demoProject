package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class MiniCar extends Car{
    MiniCar(Location location){
        super(CarType.MINI,location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("This is Mini car");
    }
}
