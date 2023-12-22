package com.example.creationalDesignPattern.Singleton;

public class SingletonNonLazyThreadSafe {

    private static volatile SingletonNonLazyThreadSafe  instance  = new SingletonNonLazyThreadSafe();
    public static SingletonNonLazyThreadSafe Instance(){
        return instance;
    }
    private SingletonNonLazyThreadSafe(){}
}
