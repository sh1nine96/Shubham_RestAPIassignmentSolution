package com.gl.javafsd.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.Role;
import com.gl.javafsd.employeemanagement.service.RoleService;

@RestController
@RequestMapping("/createRole")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping("/addNewRole")
	public String addNewRole(@RequestBody Role newRole) {
	 return	roleService.addNewRole(newRole);
	}

}
