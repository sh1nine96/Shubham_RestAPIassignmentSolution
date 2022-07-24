package com.gl.javafsd.employeemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.model.User;
import com.gl.javafsd.employeemanagement.repository.UserRepository;
import com.gl.javafsd.employeemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> listAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public String addUser(User newUser) {
		 var encodedPassword = passwordEncoder.encode(newUser.getPassword());
		 newUser.setPassword(encodedPassword);
	     User user = userRepository.save(newUser);
	     
	     return "User "+ user+ " saved to DB";
	}
	
	@Override
	public User getUserDetails(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		var user = userRepository.getUserByUsername(username);
		return new org.springframework.security.core.userdetails.User(username,user.getPassword(),true,true,true,true,new ArrayList<>());
	}

}
