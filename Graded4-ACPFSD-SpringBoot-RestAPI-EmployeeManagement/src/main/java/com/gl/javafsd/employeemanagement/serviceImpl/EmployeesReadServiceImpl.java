package com.gl.javafsd.employeemanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.repository.EmployeeRepository;
import com.gl.javafsd.employeemanagement.service.EmployeesReadService;

@Service
public class EmployeesReadServiceImpl implements EmployeesReadService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> getById(int id) {
		return employeeRepository.findById(id);
	}
	
	@Override
	public List<Employee> getEmployeesSortedByFirstName(Direction direction) {
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}
	
	public List<Employee> searchEmployeeByFirstName(String firstName) {
		Employee employeeByFirstName = new Employee();
		employeeByFirstName.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				                       .withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.exact())
				                       .withIgnorePaths("id", "lastName", "email");
		Example<Employee> example = Example.of(employeeByFirstName, exampleMatcher);
		return employeeRepository.findAll(example);
		
	}
	
	@Override
	public Employee findById(int id) {
		return employeeRepository.findById(id).get();
	}

}
