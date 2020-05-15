package com.design.creational.factory;


public class WebsiteFactory {

    public static Website getWebsite(String siteType) {

        switch (siteType) {
            case "blog" : {
                return new Blog();
            }

            case "shopping" : {
                return new Shopping();
            }

            default : {
                throw new IllegalArgumentException("Please Provide Correct Site Type");
            }
        }
    }
}
