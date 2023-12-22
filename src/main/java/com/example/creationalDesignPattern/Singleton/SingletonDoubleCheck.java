package com.example.creationalDesignPattern.Singleton;

public class SingletonDoubleCheck {

   private static SingletonDoubleCheck instance =null;
   private static Object lockObj = new Object();

   public static SingletonDoubleCheck Instance(){
       if(instance==null)
       {
              if(instance==null) {
                  instance = new SingletonDoubleCheck();
              }
       }
       return instance;
   }
   private SingletonDoubleCheck(){}
}
