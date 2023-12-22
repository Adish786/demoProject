package com.example.creationalDesignPattern.AbstractFactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Wind Button");
    }
}
