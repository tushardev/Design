package com.design.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV csv;

    public EmployeeAdapterCSV(EmployeeCSV csv) {
        this.csv = csv;
    }

    @Override
    public String getId() {
        return String.valueOf(csv.getId());
    }

    @Override
    public String getFirstName() {
        return csv.getFirstname();
    }

    @Override
    public String getLastName() {
        return csv.getLastname();
    }

    @Override
    public String getEmail() {
        return csv.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ID: " + csv.getId() + ", First name: " + csv.getFirstname() + ", Last name: " + csv.getLastname() + "," +
                " Email: " + csv.getEmailAddress();
    }
}

/**** This is Adapter which converts Employee from CSV with different fields and field type
 *** into instance of Employee class  **/
