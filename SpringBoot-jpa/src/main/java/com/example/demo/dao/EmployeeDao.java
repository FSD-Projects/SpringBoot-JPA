package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee saveEmployee(Employee employee);
}
