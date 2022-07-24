package com.gl.javafsd.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.service.EmployeeDeleteService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/deleteService")
public class EmployeeDeleteController {
	
	@Autowired
	EmployeeDeleteService deleteService;
	
	@Operation(summary = "This is to delete an employee record by his/her id")
	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam("id") int id) {
		return deleteService.deleteById(id);
	}

}
