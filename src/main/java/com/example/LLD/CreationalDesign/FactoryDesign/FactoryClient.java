package com.example.LLD.CreationalDesign.FactoryDesign;

public class FactoryClient {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        notification.notifyUser();
    }
}
