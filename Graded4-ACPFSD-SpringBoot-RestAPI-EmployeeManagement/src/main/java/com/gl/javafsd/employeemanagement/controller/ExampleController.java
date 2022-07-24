package com.gl.javafsd.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.service.ExampleService;

@RestController
public class ExampleController {
	
	@Autowired
	ExampleService exampleService;
	
	@GetMapping("/info")
	public Employee get() {
		return exampleService.get();
	}
	
	@PostMapping("/customInfo")
	public Employee customInfo(String firstName, String lastName, String email) {
		return exampleService.customInfo(firstName, lastName, email);
	}

}
