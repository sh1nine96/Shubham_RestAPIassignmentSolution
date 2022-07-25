package com.gl.javafsd.employeemanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.model.Role;
import com.gl.javafsd.employeemanagement.repository.RoleRepository;
import com.gl.javafsd.employeemanagement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public String addNewRole(Role newRole) {
		Role role = roleRepository.save(newRole);
		return "New Role "+role+" saved to DB";
	}

}
