package com.java.design.revenue.abstract_class;

import com.java.design.revenue.model.ClientData;

public class FixedPriceRevenueCalc extends RevenueCalculator {

    public static double FIXED_FEE = 500;
    private double fee;

    public FixedPriceRevenueCalc(double fixedRate) {
        this.fee = fixedRate;
    }

    @Override
    public double calculateRevenue(ClientData clientData) {
        return fee;
    }
}
