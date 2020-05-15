package com.java.design.money;

public class Money {

    private double value;
    private Currency currency;

    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    private double normalized() {
        return currency == Currency.USD ? value : value * currency.conversionRateTo(Currency.USD);
    }

    public boolean isGreaterThan(Money op) {
        return normalized() > op.normalized();
    }

}

class Test {

    public static void main(String[] args) {
        test();
    }

    private static void dispenseFunds(Money money) {
        System.out.println("Dispense The Funds");
    }

    public static void test() {
        Money balance = new Money(2.0, Currency.EURO);
        Money request = new Money(1.0, Currency.USD);

        if(balance.isGreaterThan(request)) {
            dispenseFunds(request);
        }
    }
}

enum Currency {
    USD, EURO;
    public double conversionRateTo(Currency target) {
        return 1.0;
    }
}


/**** Here we have added function to check which amout is greater in Money class itself and didn't provided
 getters and setters for getting money information and then comparing.

 We must delete the work to the class which have the information instead of getting the information outside
 and then doing comparision on it ****/