package com.example.creationalDesignPattern.factory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Popular");
        obj.spec();
    }
}
