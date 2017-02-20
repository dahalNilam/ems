package com.nilam.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nilam.domain.Employee;
import com.nilam.service.EmployeeService;
import com.nilam.util.HibernateUtil;

public class EmployeeServiceImpl implements EmployeeService {
	
	public EmployeeServiceImpl() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		populate(session);
	}
	
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
	
	protected void populate(Session session) {
		for(Employee employee : this.addEmployeesToList()) {
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
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
