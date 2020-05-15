package com.design.structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {

        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Dell Laptop", 11);
        inventorySystem.takeOrder("HP Headphone", 21);
        inventorySystem.takeOrder("Sony TV", 31);
        inventorySystem.takeOrder("Seagate HDD", 41);
        inventorySystem.takeOrder("NOC Monitor", 51);

        inventorySystem.takeOrder("Sony TV", 101);
        inventorySystem.takeOrder("Sony TV", 102);
        inventorySystem.takeOrder("Sony TV", 103);

        inventorySystem.takeOrder("HP Headphone", 201);
        inventorySystem.takeOrder("HP Headphone", 202);

        inventorySystem.takeOrder("Seagate HDD", 301);
        inventorySystem.takeOrder("NOC Monitor", 401);

        inventorySystem.process();

        System.out.println("\n----------------Total Items-------------");
        System.out.println(inventorySystem.report());
    }
}
