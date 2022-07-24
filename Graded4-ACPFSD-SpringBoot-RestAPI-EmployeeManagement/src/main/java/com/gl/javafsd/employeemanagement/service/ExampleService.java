package com.gl.javafsd.employeemanagement.service;

import com.gl.javafsd.employeemanagement.model.Employee;

public interface ExampleService {

	Employee get();

	Employee customInfo(String firstName, String lastName, String email);

}