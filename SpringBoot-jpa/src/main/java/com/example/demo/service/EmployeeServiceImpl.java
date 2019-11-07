package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.saveEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeById(id);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);				
	}

	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByFirstName(firstName);
	}

}
