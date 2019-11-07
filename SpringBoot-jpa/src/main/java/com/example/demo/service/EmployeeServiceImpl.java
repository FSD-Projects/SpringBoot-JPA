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

}
