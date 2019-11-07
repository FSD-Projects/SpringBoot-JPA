package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private EntityManager entityManager;
	
	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		Employee employee = entityManager.merge(theEmployee);
		employee.setEmployeeId(theEmployee.getEmployeeId());
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		saveEmployee(employee);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("delete from Employee where employeeId =:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from Employee e where e.firstName=:firstName");
		query.setParameter("firstName", firstName);
		return query.getResultList();
	}

}
