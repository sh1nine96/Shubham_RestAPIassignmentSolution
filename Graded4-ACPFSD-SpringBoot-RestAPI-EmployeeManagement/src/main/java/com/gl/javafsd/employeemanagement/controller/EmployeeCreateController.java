package com.gl.javafsd.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.service.EmployeeCreateService;


@RestController
@RequestMapping("/createService")
public class EmployeeCreateController {
	
	@Autowired
	EmployeeCreateService createService;
	
	@PostMapping("/addEmployees")
	public String addEmployees(@RequestBody List<Employee> employees) {
		return createService.addEmployees(employees);
	}

}

