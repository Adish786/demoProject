package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class LuxaryCar extends Car{
    LuxaryCar(Location location)
    {
        super(CarType.LUXURY,location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("This is Luxary car");
    }
}
