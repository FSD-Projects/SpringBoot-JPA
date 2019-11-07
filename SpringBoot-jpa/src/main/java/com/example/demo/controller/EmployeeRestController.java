package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeService employeeService;

	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	public List<Employee> getEmployeeList() {
		return employeeService.getAllEmployees();
	}
}
