package com.example.creationalDesignPattern.AbstractFactory;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Win Check Box");
    }
}
