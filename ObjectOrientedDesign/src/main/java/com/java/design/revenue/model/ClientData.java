package com.java.design.revenue.model;

public class ClientData {

    private String clientName;

    private int hours;

    public ClientData(String clientName, int hours) {
        this.clientName = clientName;
        this.hours = hours;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
