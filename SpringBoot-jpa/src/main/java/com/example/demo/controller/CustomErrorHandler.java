package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException enfe) {
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(), enfe.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<CustomErrorResponse> handleEmployeeNotFoundException(Exception e) {
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
