package com.example.LLD.CreationalDesign.FactoryDesign;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("This is SMS Notification");
    }
}
