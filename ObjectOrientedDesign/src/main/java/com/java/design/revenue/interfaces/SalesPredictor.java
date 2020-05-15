package com.java.design.revenue.interfaces;

import com.java.design.revenue.model.ClientData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SalesPredictor {

    public static void main(String[] args) {

         List<ClientData> clients = Arrays.asList(
                 new ClientData("Amazon", 10),
                 new ClientData("Microsoft", 20));

         System.out.println("Hourly Calculator");
         printTotalRevenue(clients, new HourlyRevenueCalculator(50));

        System.out.println("Fixed Price Calculator");
        printTotalRevenue(clients, new FixedPriceRevenueCalculator(5000));
    }

    public static void printTotalRevenue(List<ClientData> clients, RevenueCalculatorInt calculator) {

        Optional<Double> total = clients.stream().map(s -> calculator.calculateRevenue(s)).reduce(Double::sum);

        if(total.isPresent()) {
            System.out.println("Total Revenue: " + total.get());
        }
    }
}


/*** Here method takes Calculator argument as Interface and you can pass any implemenation at runtime.
     Same method will work for all ***/