package com.example.creationalDesignPattern.builder;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setBattery(4500).setProcessor("Intel").getPhone();
        System.out.println(p);
       House house = new House.HouseBuilder("walls","roos","kitchen").build();
       System.out.println(house);
    }
}
