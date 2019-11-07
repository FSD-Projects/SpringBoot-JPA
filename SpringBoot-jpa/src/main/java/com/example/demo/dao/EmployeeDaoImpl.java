package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employee;
	}

}
