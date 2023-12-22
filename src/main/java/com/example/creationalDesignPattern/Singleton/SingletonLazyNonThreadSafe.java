package com.example.creationalDesignPattern.Singleton;

public class SingletonLazyNonThreadSafe {
    private static SingletonLazyNonThreadSafe instance=null;
    public static SingletonLazyNonThreadSafe Instance(){
        if(instance==null)
        {
            instance = new SingletonLazyNonThreadSafe();
        }
        return instance;
    }
    private SingletonLazyNonThreadSafe(){

    }
}
