package com.gl.javafsd.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.gl.javafsd.employeemanagement.model.Employee;

public interface EmployeesReadService {

	List<Employee> getAllEmployees();
	
	Optional<Employee> getById(int id);
	
	List<Employee> getEmployeesSortedByFirstName(Direction direction);

	Employee findById(int id);

	List<Employee> searchEmployeeByFirstName(String firstName);

}