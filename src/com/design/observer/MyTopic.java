package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observerList;
    private String message;
    private boolean isChanged;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(null != observer) {
            synchronized (MUTEX) {
                if(!observerList.contains(observer)) {
                    observerList.add(observer);
                }
            }
        } else {
            throw new RuntimeException("Observer is Null");
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal;

        synchronized (MUTEX) {
            if(!isChanged) {
                return;
            }
            observerLocal = new ArrayList<>(this.observerList);
            isChanged = false;
        }

        for (Observer observer: observerLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdte(Observer observer) {
        return this.message;
    }

    /* Method called by Clients to post the message to Topic */
    public void postMessageToTopic(String message) {
        System.out.println("Method Posted to Topic :" + message);
        this.message = message;
        this.isChanged = true;
        notifyObservers();
    }
}

/*****
 *  Register, unregister and notify methods are Syncronized so that the message should be send to only valid observers.
 *  Also isChanged flag is used to check if message is new. If it is already notified and someone calls notify Observer
 *  method, it will not send the already sent message again.
 *
 *  */


