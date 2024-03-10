package com.example.LLD.CreationalDesign.FactoryDesign;

public class NotificationFactory {
    public Notification createNotification(String chanel){
        if(chanel==null || chanel.isEmpty())
            return null;
        switch (chanel){
        case "SMS":
           return new SMSNotification();
        case "Email":
            return new EmailNotification();
            default:
        throw new IllegalArgumentException("Unknown Channel"+chanel);
    }
    }
}
