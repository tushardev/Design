package com.design.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String ccv;
    private String cardExpiry;

    public CreditCardPayment(String name, String cardNumber, String ccv, String cardExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.cardExpiry = cardExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Rs. "+ amount+ " Payment Done using Credit/Debit Card by: " + name + " using card number: " + cardNumber);
    }

}
