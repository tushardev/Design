package com.java.design.revenue.interfaces;

import com.java.design.revenue.model.ClientData;

public class HourlyRevenueCalculator implements RevenueCalculatorInt {

    public static double HOURLY_RATE = 50;
    private double hourlyRate;

    public HourlyRevenueCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRevenue(ClientData clientData) {
        return clientData.getHours() * hourlyRate;
    }
}