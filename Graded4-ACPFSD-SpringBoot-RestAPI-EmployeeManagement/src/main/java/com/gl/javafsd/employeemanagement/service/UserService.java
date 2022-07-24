package com.gl.javafsd.employeemanagement.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

import com.gl.javafsd.employeemanagement.model.User;

public interface UserService extends UserDetailsService{

	List<User> listAllUsers();

	String addUser(User user);

	User getUserDetails(String username);

}