package com.design.structural.proxy;

public class TwitterServiceStub implements TwitterService {


    @Override
    public String getTimeline(String screenName) {
        return "My neato Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
