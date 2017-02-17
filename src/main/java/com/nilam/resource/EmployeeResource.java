package com.nilam.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nilam.domain.Employee;
import com.nilam.serviceImpl.EmployeeServiceImpl;

@Path(value = "employeeList")
public class EmployeeResource {
	
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployeeList() {
		return employeeService.getEmployeeList();
	}

}
