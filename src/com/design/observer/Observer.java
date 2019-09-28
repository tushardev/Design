package com.design.observer;

public interface Observer {

    /* Method for Subject to send updates */
    void update();

    /* Method to attach Subject with Observer */
    void setSubject(Subject subject);


}
