package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee findById(int id);
	public void deleteEmployeeById(int id);
	public List<Employee> getEmployeeByFirstName(String firstName);
}
