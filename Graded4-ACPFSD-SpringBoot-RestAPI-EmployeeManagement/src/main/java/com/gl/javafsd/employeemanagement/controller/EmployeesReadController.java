package com.gl.javafsd.employeemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.service.EmployeesReadService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/readService")
public class EmployeesReadController {

	@Autowired
	EmployeesReadService employeesReadService;
	
	
    @Operation(summary = "This is to list all the employees stored in DB")
	@GetMapping("/listAllEmployee")
	public List<Employee> listAllEmployee() {
		return employeesReadService.getAllEmployees();
	}
    
    @Operation(summary = "This is to fetch an employee by id stored in DB")
	@GetMapping("/getEmployeeById")
	public Optional<Employee> getEmployeeById( int id) {
		return employeesReadService.getById(id);
	}
    
    @Operation(summary = "This is to search all employees sorted by their first name in Ascending and Descending order ")
	@GetMapping("/getEmployeesSortedByFirstName")
	public List<Employee> getEmployeesSortedByFirstName(Direction direction) {
		return employeesReadService.getEmployeesSortedByFirstName(direction);

	}
	
    @Operation(summary = "This is to fetch all employees by their first name and if found one or more fetch all")
	@GetMapping("/getEmployeesByFirstName")
	public List<Employee> getEmployeesByFirstName(String firstName) {
		return employeesReadService.searchEmployeeByFirstName(firstName);
	}

}
