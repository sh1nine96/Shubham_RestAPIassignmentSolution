package com.gl.javafsd.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.service.EmployeeUpdateRecordService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/updateService")
public class EmployeeUpdateRecordController {
	
	@Autowired
	EmployeeUpdateRecordService updateRecordService;
	
	@Operation(summary = "This is to update an existing employee record in DB")
	@PutMapping("/updateExistingEmployee")
	public Employee updateExistingEmployee(@RequestParam("id") int id,
			                               @RequestParam("firstName") String firstName,
			                               @RequestParam("lastName") String lastName,
			                               @RequestParam("email") String email) {
		return updateRecordService.updateExistingEmployee(id, firstName, lastName, email);
	}
}