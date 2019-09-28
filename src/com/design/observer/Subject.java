package com.design.observer;

public interface Subject {

    /* Methods to register and unregister Observers */
    void register(Observer observer);
    void unregister(Observer observer);

    /* Method to notify observers */
    void notifyObservers();

    /* Method for Observers to get the update from Subject */
    Object getUpdte(Observer observer);
}
