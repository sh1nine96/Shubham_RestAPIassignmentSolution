package com.gl.javafsd.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/")
	public String handelWelcome() {
		return "<h1>Welcome to Employee Management</h1>";
	}

}
