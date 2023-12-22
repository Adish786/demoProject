package com.example.creationalDesignPattern.Singleton;

public final class Singleton {
    private static Singleton single_instance = null;
    public String s;

    private Singleton() {
        s = "Hello I am a String part of Singleton class";
    }

    public static  synchronized Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
