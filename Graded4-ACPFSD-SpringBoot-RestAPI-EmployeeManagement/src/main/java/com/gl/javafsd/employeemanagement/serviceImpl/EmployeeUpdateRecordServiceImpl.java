package com.gl.javafsd.employeemanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.javafsd.employeemanagement.model.Employee;
import com.gl.javafsd.employeemanagement.repository.EmployeeRepository;
import com.gl.javafsd.employeemanagement.service.EmployeeUpdateRecordService;

@Repository
public class EmployeeUpdateRecordServiceImpl implements EmployeeUpdateRecordService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee updateExistingEmployee(
			int id, String firstName, String lastName, String email) {
		if(employeeRepository.findById(id).isPresent()) {
			Employee existingEmployee = employeeRepository.findById(id).get();
			
			existingEmployee.setFirstName(firstName);
			existingEmployee.setLastName(lastName);
			existingEmployee.setEmail(email);
			
			Employee updatedEmployee = employeeRepository.save(existingEmployee);
			
			return new Employee(updatedEmployee.getId(), updatedEmployee.getFirstName(), updatedEmployee.getLastName(),
					updatedEmployee.getEmail());
		}else {
			throw new RuntimeException("There is no Employee present with the id "+ id);
		}
	}
}
	

