package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class DefaultFactory {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
            case MINI:
                car = new MiniCar(Location.DEFAULT);
            case LUXURY:
                car = new LuxaryCar(Location.DEFAULT);
            default:
                break;
        }
        return car;
    }
}
