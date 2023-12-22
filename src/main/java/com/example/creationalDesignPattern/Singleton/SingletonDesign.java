package com.example.creationalDesignPattern.Singleton;

public class SingletonDesign {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of x is " + y.hashCode());
        System.out.println("Hashcode of x is " + z.hashCode());

        if(x==y && y==z)
        {
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else
        {
            System.out.println("Three objects DON'T point to the same memory location on the heap i.e, to the same object");
        }
    }
}
