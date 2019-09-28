package com.design.observer;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdte(this);
        if(null != message) {
            System.out.println("Consuming message: " + message);
        } else {
            System.out.println("No new message on Subject");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
