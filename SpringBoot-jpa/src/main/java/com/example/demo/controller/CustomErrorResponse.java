package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomErrorResponse {
	private int statusCode;
	private String message;
	private long logTime;
}
