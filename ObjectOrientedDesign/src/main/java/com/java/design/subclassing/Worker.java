package com.java.design.subclassing;

import java.util.Currency;

interface Timesheet {};

interface Invoice {};

interface Payable {
    void pay();
}

class Money {
    public Money(double value, Currency currency) {
    }
}

public abstract class Worker implements Payable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void pay() {
        System.out.println("Paid the Worker");
        Money due = getAmountDue();
    }

    abstract protected Money getAmountDue();
}

class Employee extends Worker {

    private Timesheet[] unpaidTimesheets;

    public Employee(String name) {
        super(name);
    }

    public void attachTimesheets(Timesheet timesheet) {
        System.out.println("Attached the Time sheets");
    }

    @Override
    protected Money getAmountDue() {
       return new Money(15.00, java.util.Currency.getInstance("USD"));
    }

}

class Contractors extends Worker {

    private Invoice[] invoices;

    public Contractors(String name) {
        super(name);
    }

    public void attachInvoces(Invoice invoice) {
        System.out.println("Attached the Invoices");
    }

    @Override
    protected Money getAmountDue() {
        return new Money(10.00, java.util.Currency.getInstance("USD"));
    }
}


class AccountPayable {
    private Payable[] creditors;

    public void payEverybody() {
        for (Payable creditor : creditors) {
            creditor.pay();
        }
    }
}

/**** This structure shows where to use abstract class and where to use interface.
 * Class Account Payable has reference to Payable which can be used any type of worker
 * as worker has implemented Payable interface. This makes the Account Payable more generic
 * for any type which is Payable.
 */
