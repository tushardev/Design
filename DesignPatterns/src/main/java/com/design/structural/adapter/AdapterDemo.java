package com.design.structural.adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		employees.forEach(s -> System.out.println(s.toString()));
	}
}
