package com.gl.javafsd.employeemanagement.service;

import com.gl.javafsd.employeemanagement.model.Employee;

public interface EmployeeUpdateRecordService {

	Employee updateExistingEmployee(int id, String firstName, String lastName, String email);
	
	

}
