package com.java.design.revenue.abstract_class;

import com.java.design.revenue.model.ClientData;

public class HourlyRevenueCalc extends RevenueCalculator {

    public static double HOURLY_RATE = 50;
    private double hourlyRate;

    public HourlyRevenueCalc(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRevenue(ClientData clientData) {
        System.out.println("Hourly Revenue Calculation");
        return clientData.getHours() * hourlyRate;
    }
}