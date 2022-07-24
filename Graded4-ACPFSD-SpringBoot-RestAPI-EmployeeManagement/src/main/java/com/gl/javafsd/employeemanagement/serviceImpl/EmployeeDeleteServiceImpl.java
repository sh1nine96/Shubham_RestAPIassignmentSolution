package com.gl.javafsd.employeemanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.repository.EmployeeRepository;
import com.gl.javafsd.employeemanagement.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
	
	@Autowired
	EmployeeRepository employeeRepository;	
	
	@Override
	public String deleteById(int id) {
		employeeRepository.deleteById(id);
		return "Library by this id "+ id +" is deleted";
	}

}
