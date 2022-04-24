package com.design.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
	
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "Virat", "Kohli", "vk@ind.com");
		
		employees.add(employeeFromDB);

		/*** Convert the Ldap employee Object to Employee instance */
		EmployeeLdap employeeFromLdap = new EmployeeLdap("2828", "Steve", "Smith", "sm@aus.com");
		
		Employee employeeLdap = new EmployeeAdapterLdap(employeeFromLdap);

		employees.add(employeeLdap);

		/*** Convert CSV employee object to Employee instance */

		EmployeeCSV employeeFromCSV = new EmployeeCSV("0109,Joo,Root,jr@eng.com");

		Employee employeeCSV = new EmployeeAdapterCSV(employeeFromCSV);

		employees.add(employeeCSV);
		
		return employees;
	}
	
}
