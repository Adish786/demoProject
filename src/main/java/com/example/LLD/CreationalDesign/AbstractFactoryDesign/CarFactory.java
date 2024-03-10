package com.example.LLD.CreationalDesign.AbstractFactoryDesign;

public class CarFactory {
    private CarFactory(){}
    public static Car buildCar(CarType carType){
        Car car =null;
        Location location = Location.INIDA;
        switch (location){
            case INIDA :
                car = IndiaFactory.buildCar(carType);
                break;
            default:
                car = DefaultFactory.buildCar(carType);
        }
        return car;
    }
}
