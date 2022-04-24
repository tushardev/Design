package com.design.creational.builder;

public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Builder Bread").codiments("Builder Codiments").dressing("Builder Dressing").
                meat("Builder Meat");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
