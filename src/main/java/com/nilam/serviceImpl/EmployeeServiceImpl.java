package com.nilam.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilam.domain.Employee;
import com.nilam.repository.EmployeeRepository;
import com.nilam.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;		
	
	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByEmployeeId(Long employeeId) {
		return employeeRepository.findOne(employeeId);
	}

	@Override
	public void delete(Long employeeId) {
		employeeRepository.delete(employeeId);

	}
}