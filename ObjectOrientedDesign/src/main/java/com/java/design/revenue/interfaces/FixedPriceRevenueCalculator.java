package com.java.design.revenue.interfaces;

import com.java.design.revenue.model.ClientData;

public class FixedPriceRevenueCalculator implements RevenueCalculatorInt {

    public static double FIXED_FEE = 500;
    private double fee;

    public FixedPriceRevenueCalculator(double fixedRate) {
        this.fee = fixedRate;
    }

    @Override
    public double calculateRevenue(ClientData clientData) {
        return fee;
    }
}
