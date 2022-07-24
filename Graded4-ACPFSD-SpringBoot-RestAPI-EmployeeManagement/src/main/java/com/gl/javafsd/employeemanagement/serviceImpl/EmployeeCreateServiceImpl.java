package com.gl.javafsd.employeemanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.repository.EmployeeRepository;
import com.gl.javafsd.employeemanagement.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployees(List<Employee> employees) {
		employeeRepository.saveAll(employees);
		employeeRepository.flush();
		return "Saved";
	}

}
