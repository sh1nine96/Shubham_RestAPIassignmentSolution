package com.gl.javafsd.employeemanagement.serviceImpl;

import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {
	
	@Override
	public Employee get() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Shubham");
		employee.setLastName("Sharma");
		employee.setEmail("shubham@gmail.com");
		return employee;
	}
	
	@Override
	public Employee customInfo(String firstName, String lastName, String email) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		return employee;
		
	}

}
