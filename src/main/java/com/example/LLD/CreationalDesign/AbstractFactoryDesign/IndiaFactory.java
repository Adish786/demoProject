package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class IndiaFactory {
    static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case MICRO :
                car = new MicroCar(Location.INIDA);
                break;
            case MINI:
                car = new MiniCar(Location.INIDA);
                break;
            case LUXURY:
                car = new LuxaryCar(Location.INIDA);
                break;
            default:
                break;
        }
        return car;
    }
}
