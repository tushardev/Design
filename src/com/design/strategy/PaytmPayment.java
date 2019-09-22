package com.design.strategy;

public class PaytmPayment implements PaymentStrategy {

    private String name;
    private String mobileNumber;

    public PaytmPayment(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Rs. "+ amount+ " Payment Done using Paytm by: " + name);
    }
}
