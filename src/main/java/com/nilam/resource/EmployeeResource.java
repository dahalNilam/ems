package com.nilam.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nilam.domain.Employee;
import com.nilam.serviceImpl.EmployeeServiceImpl;

@Path(value = "employeeList")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

	@GET
	public List<Employee> getEmployeeList() {
		return employeeService.getEmployeeList();
	}
	
	@GET
	@Path(value="{employeeId}")
	public Employee getEmployee(@PathParam("employeeId") long id) {
		return employeeService.getEmployee(id);
	}
	
	@PUT
	@Path(value="{employeeId}")
	public Employee updateEmployee(@PathParam("employeeId") long id, Employee employee) {
		employee.setId(id);
		return employeeService.updateEmployee(employee); 
	}
	
	@POST
	public Employee addEmployee(Employee employee) {
		return employeeService.addEmployee(employee);
	}

}
