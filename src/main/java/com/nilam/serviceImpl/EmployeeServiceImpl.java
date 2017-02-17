package com.nilam.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.nilam.domain.Employee;

public class EmployeeServiceImpl {
	
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee(1l, "Nilam", "Manager", null);
		Employee e2 = new Employee(2l, "Manish", "CEO", null);
		Employee e3 = new Employee(3l, "Prajil", "Programmer", null);
		Employee e4 = new Employee(4l, "Gyanu", "Tester", null);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		return employeeList;
	}

}
