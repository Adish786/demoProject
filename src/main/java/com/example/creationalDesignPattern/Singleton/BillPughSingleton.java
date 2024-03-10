package com.example.creationalDesignPattern.Singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    //TODO create this inner class will help to creating the object and not able to access outside
    private static class DbConnectionHelper{
        private static final BillPughSingleton INSTANCE_OBJECT = new BillPughSingleton();
    }
    public static  BillPughSingleton getInstance(){
        return DbConnectionHelper.INSTANCE_OBJECT;
    }
}
