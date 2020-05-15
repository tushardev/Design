package com.design.creational.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {

        testLunchOrderBean();
        testLunchOrderTele();

    }

    /*** Method to test object creation using setters */
    private static void testLunchOrderBean() {
        LunchOrderBean bean = new LunchOrderBean();
        bean.setBread("Bean Bread");
        bean.setCondiments("Bean Condiments");
        bean.setDressing("Bean Dressings");
        bean.setMeat("Bean Meat");

        System.out.println(bean.getBread());
        System.out.println(bean.getCondiments());
        System.out.println(bean.getDressing());
        System.out.println(bean.getMeat());

    }

    /*** Method to test object creation using constructor */
    private static void testLunchOrderTele() {
        LunchOrderTele tele = new LunchOrderTele("Tele Bread","Tele Condiments",
                "Tele Dressings","Tele Meat");

        System.out.println(tele.getBread());
        System.out.println(tele.getCondiments());
        System.out.println(tele.getDressing());
        System.out.println(tele.getMeat());
    }
}
