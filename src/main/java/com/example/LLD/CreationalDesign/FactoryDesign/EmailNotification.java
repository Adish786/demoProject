package com.example.LLD.CreationalDesign.FactoryDesign;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("This is Email Notification");
    }
}
