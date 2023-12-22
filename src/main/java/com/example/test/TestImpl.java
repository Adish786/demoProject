package com.example.test;

public class TestImpl implements TestInterface{
    public static void main(String[] args) {
        TestImpl test = new TestImpl();
      //  test.getData(1,2);  //Ambugity method
    }
    @Override
    public String getData(String value) {
        return null;
    }
    public String getData(String value, String data) {
        return value + "" + data;
    }
    public String getData(String value, int data) {
        return value + "" + data;
    }
    public String getData(int value, Integer data) {
        return value + "" + data;
    }
    public String getData(Integer value, Integer data) {
        return value + "" + data;
    }

}
