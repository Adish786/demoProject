package com.example.javaprogram;

public class Paytm implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {
        String txDate = UPIPayment.datePattern("yyyy-MM-dd");
        return txDate;
    }

    @Override
    public double getScrachCard() {
        return UPIPayment.super.getScrachCard();
    }
}
