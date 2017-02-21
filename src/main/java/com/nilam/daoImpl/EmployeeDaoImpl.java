package com.nilam.daoImpl;

import com.nilam.dao.EmployeeDao;
import com.nilam.domain.Employee;

public class EmployeeDaoImpl extends GenericDaoImpl<Employee> implements EmployeeDao {

	public EmployeeDaoImpl() {
		super.setDaoType(Employee.class);
	}

}
