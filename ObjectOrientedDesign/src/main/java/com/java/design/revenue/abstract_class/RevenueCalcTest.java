package com.java.design.revenue.abstract_class;

import com.java.design.revenue.model.ClientData;

public class RevenueCalcTest {

    RevenueCalculator revenueCalculator;

    public static void main(String[] args) {

        ClientData clientData = new ClientData("Amazon", 5);

        RevenueCalculator revenueCalculator = new HourlyRevenueCalc(HourlyRevenueCalc.HOURLY_RATE);
        final double hourlyPrice = revenueCalculator.calculateRevenue(clientData);
        System.out.println(hourlyPrice);


        revenueCalculator = new FixedPriceRevenueCalc(FixedPriceRevenueCalc.FIXED_FEE);
        final double fixedPrice = revenueCalculator.calculateRevenue(clientData);
        System.out.println(fixedPrice);
    }
}
