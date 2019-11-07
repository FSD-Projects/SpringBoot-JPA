package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployeeById(int id);
	public Employee findById(int id);
	public List<Employee> getEmployeeByFirstName(String firstName);
}
