package com.gl.javafsd.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.javafsd.employeemanagement.model.Employee;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class Graded4AcpfsdSpringBootRestApiEmployeeManagementApplication {
	
	public static void main(String[] args) {		
		SpringApplication.run(Graded4AcpfsdSpringBootRestApiEmployeeManagementApplication.class, args);
		System.out.println("Server started for the project");
		
		
		
	
	}

}
