package com.java.design.interfaces;

public class Worker {
    public void pay() {
        System.out.println("Paid to Worker");
    }
}

class Employee extends Worker {

}

class Contractor extends Worker {

}

class Volunteer extends Worker {
    @Override
    public void pay() {
        throw new UnsupportedOperationException();
    }
}

class TestDemo {
    public static void main(String[] args) {
        Worker[] workers = new Worker[]{new Employee(), new Contractor(), new Volunteer()};
        for (Worker worker: workers) {
            worker.pay();
        }
    }
}

/***** This violets Interface Segregation Principle. Here the Pay method for Volunteer is not applicable
 * even though he is worker. Here we have to implement method to throw exception. Thus he should not extend Worker
 * class even though he is worker as payment is not applicable for him.
 */

