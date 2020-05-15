package com.design.structural.adapter;


public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap ldap;

    public EmployeeAdapterLdap(EmployeeLdap ldap) {
        this.ldap = ldap;
    }

    @Override
    public String getId() {
       return ldap.getCn();
    }

    @Override
    public String getFirstName() {
        return ldap.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldap.getSurname();
    }

    @Override
    public String getEmail() {
        return ldap.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + ldap.getCn() + ", First name: " + ldap.getGivenName() + ", Last name: " + ldap.getSurname() + "," +
                " Email: " + ldap.getMail();
    }
}

/**** This is Adapter which converts Employee from LDAP with different fields into instance of Employee class  **/

/** Here we have added to string method to get the same output as Employee DB class. This doesn't make this
 Decorator Pattern. We are just making the output same as expected and not adding new functionality ***/