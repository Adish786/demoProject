package com.example.test;

public interface TestInterface {
    public String getData(String value);
    default String getData(String value, String data){
        return value + " " +data;
    }
}
