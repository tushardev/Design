package com.java.design.interfaces;

public interface Payable {
     default void pay() {
        System.out.println("Default Paid to Payable Creditors");
    }
}

class EmployeeNew implements Payable {
    @Override
    public void pay() {
        System.out.println("Employee Salary Paid to Payable Creditors");
    }
}

class ContractorNew implements Payable {

}

/*** Volunteer will implement payable as it is not applicable to him **/
class VolunteerNew {

}

class TestDemoNew {
    public static void main(String[] args) {
        Payable[] creditors = new Payable[]{new EmployeeNew(), new ContractorNew()};
        for (Payable creditor: creditors) {
            creditor.pay();
        }
    }
}

/**** Here we have replaced the Worker class with Payable interface. Still provided default implementation
 * But the subclass can override its pay method as required
 * Volunteer will not have to implement the payable interface ***/