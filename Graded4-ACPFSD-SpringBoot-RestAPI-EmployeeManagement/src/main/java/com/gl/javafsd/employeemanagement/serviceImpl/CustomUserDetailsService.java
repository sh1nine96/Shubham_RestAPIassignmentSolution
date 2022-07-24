package com.gl.javafsd.employeemanagement.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.javafsd.employeemanagement.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		var user = userRepository.getUserByUsername(username);
		return new User(username,user.getPassword(),true,true,true,true,new ArrayList<>());
	
	}
	

}
