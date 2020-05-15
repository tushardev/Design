package com.design.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        System.out.println("-----Blog Pages----");

        Website blog = WebsiteFactory.getWebsite("blog");

        blog.getPages().forEach(s -> System.out.println(s));

        System.out.println("-----Shopping Pages----");

        Website shopping = WebsiteFactory.getWebsite("shopping");

        shopping.getPages().forEach(s -> System.out.println(s));

    }
}
