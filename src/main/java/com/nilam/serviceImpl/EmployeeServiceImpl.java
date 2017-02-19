package com.nilam.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.nilam.domain.Employee;
import com.nilam.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> employeeList = new ArrayList<>();

	public List<Employee> getEmployeeList() {
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
	
	public Employee getEmployee(long id) {
		return new Employee(id, "Nilam", "Manager", null);
	}

	public Employee addEmployee(Employee employee) {
		employeeList.add(employee);
		return employeeList.get(employeeList.size()-1);
	}

	public Employee updateEmployee(Employee employee) {
		return employee;
	}

}
