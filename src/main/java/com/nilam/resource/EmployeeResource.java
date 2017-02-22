package com.nilam.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.nilam.domain.Employee;
import com.nilam.serviceImpl.EmployeeServiceImpl;

@Path(value = "employeeList")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	@Autowired
	EmployeeServiceImpl employeeService;

	@GET
	public List<Employee> getEmployeeList() {
//		return employeeService.getAllEmployee();
		return this.addEmployeesToList();
	}

	@GET
	@Path(value="{employeeId}")
	public Employee getEmployee(@PathParam("employeeId") long employeeId) {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}

	@PUT
	@Path(value="{employeeId}")
	public void updateEmployee(@PathParam("employeeId") long id, Employee employee) {
		employee.setId(id);
		employeeService.save(employee);
	}

	@POST
	public void addEmployee(Employee employee) {
		employeeService.save(employee);
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
