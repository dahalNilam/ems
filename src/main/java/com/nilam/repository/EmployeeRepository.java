package com.nilam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nilam.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
