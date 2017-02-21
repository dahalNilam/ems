package com.nilam.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.nilam.dao.EmployeeDao;
import com.nilam.daoImpl.EmployeeDaoImpl;
import com.nilam.domain.Employee;
import com.nilam.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	public EmployeeServiceImpl() {
		populate();
	}
	
	public List<Employee> getEmployeeList() {
		
		return employeeDao.findAll();
	}
	
	public Employee getEmployee(long id) {
		return new Employee(id, "Nilam", "Manager", null);
	}

	public Employee addEmployee(Employee employee) {
		employeeDao.create(employee);
		return employeeDao.findById(employee.getId());
	}

	public Employee updateEmployee(Employee employee) {
		return employee;
	}
	
	protected void populate() {
		for(Employee employee : this.addEmployeesToList()) {
			employeeDao.create(employee);
		}
	}
	
	protected List<Employee> addEmployeesToList() {
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
