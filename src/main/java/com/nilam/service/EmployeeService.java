package com.nilam.service;

import java.util.List;

import com.nilam.domain.Employee;

public interface EmployeeService {

	void save(Employee course);

	List<Employee> getAllEmployee();

	Employee getEmployeeByEmployeeId(Long employeeId);

	void delete(Long employeeId);
}
