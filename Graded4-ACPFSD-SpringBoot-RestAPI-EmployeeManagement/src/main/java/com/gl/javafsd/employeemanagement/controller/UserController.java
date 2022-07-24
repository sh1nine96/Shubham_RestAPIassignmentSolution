package com.gl.javafsd.employeemanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.javafsd.employeemanagement.model.User;
import com.gl.javafsd.employeemanagement.service.UserService;

@RestController
@RequestMapping("/UserService")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/fetchAllUsers")
	public List<User> fetchAllUsers() {
		return userService.listAllUsers();
	}
	
	@PostMapping("/addNewUser")
	public String addNewUser(@Valid @RequestBody User user) {
		return userService.addUser(user);
	}

}
