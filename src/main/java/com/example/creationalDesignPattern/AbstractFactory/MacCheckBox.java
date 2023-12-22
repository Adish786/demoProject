package com.example.creationalDesignPattern.AbstractFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
