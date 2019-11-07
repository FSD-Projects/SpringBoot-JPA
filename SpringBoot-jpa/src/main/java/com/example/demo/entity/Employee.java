package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "new_employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_id")
	private int employeeId;
	@Column(name = "first_name")
	@NotNull(message = "First name cannot be empty")
	private String firstName;
	@Column(name = "last_name")
	@NotNull(message = "Last name cannot be empty")
	private String lastName;
	@Column(name = "salary")
	@NotNull(message = "Salary name cannot be empty")
	private double salary;
}
