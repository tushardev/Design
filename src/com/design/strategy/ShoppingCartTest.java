package com.design.strategy;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item shirt = new Item();
        shirt.setItemCode("12345");
        shirt.setPrice(700);

        Item trouser = new Item();
        trouser.setItemCode("4512");
        trouser.setPrice(1000);

        System.out.print("=======Shopping Started===========\n");

        shoppingCart.addItem(shirt);
        shoppingCart.addItem(trouser);
        shoppingCart.pay(new CreditCardPayment("Tushar", "12345678", "447", "07/2020"));

        shoppingCart.removeAllItem();

        shoppingCart.addItem(shirt);
        shoppingCart.addItem(trouser);
        shoppingCart.pay(new PaytmPayment("Pallavi Kadale", "7588166128"));

        System.out.print("=======Shopping Completed===========");
    }
}
