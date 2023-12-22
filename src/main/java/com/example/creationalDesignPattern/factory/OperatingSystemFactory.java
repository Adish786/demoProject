package com.example.creationalDesignPattern.factory;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Power"))
            return new Android();
        else if(str.equals("Popular"))
            return new Windows();
        else
            return new IOS();
    }
}
