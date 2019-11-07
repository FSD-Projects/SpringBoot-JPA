package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping("/employees")
	public List<Employee> getEmployeeList() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@Valid @RequestBody Employee employee, BindingResult result) {
		/* employee.setEmployeeId(0); */
		if(result.hasErrors()) {
			return result.getFieldError().toString();
		}
		employeeService.saveEmployee(employee);
		return "Employee added";
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/employees/{theId}")
	public Employee findEmployeeById(@PathVariable int theId) {
		Employee theEmployee = employeeService.findById(theId);
		if(theEmployee == null) {
			throw new EmployeeNotFoundException("Employee with employee id" + theId + "is not found");
		}
		return theEmployee;
		
	}
	@DeleteMapping("/employees/{theId}")
	public String deleteEmployeeById(@PathVariable int theId) {
		Employee theEmployee = employeeService.findById(theId);
		if(theEmployee == null) {
			throw new EmployeeNotFoundException("Employee with employee id " + theId + " is not found");
		}
		employeeService.deleteEmployeeById(theId);
		return "Deleted employee id - " + theId;	
	}
	@GetMapping("/employees/list/{firstName}")
	public List<Employee> getEmployeeListByFirstName(@PathVariable String firstName) {
		return employeeService.getEmployeeByFirstName(firstName);		
	}
}
