package com.design.observer;

public class ObserverTest {

    public static void main(String[] args) {

        MyTopic topic = new MyTopic();

        Observer observerOne = new MyTopicSubscriber("ObjectOne");
        Observer observerTwo = new MyTopicSubscriber("ObjectTwo");
        Observer observerThree = new MyTopicSubscriber("ObjectThree");

        topic.register(observerOne);
        topic.register(observerTwo);
        topic.register(observerThree);

        observerOne.setSubject(topic);
        observerTwo.setSubject(topic);
        observerThree.setSubject(topic);

        observerOne.update();

        topic.postMessageToTopic("New Message to Topic");

        System.out.println("\nGetting the new message again");
        observerTwo.update();

        topic.postMessageToTopic("Refreshed New Message to Topic");

        System.out.println("\nGetting the new message again");
        observerTwo.update();

    }
}
