package com.custom.annotation.createmyownannotation.service;

import org.springframework.stereotype.Component;

import com.custom.annotation.createmyownannotation.annotations.LogExecutionTime;

@Component
public class ServiceExample {
	@LogExecutionTime
	public String helloUser() {
		return "Hello World";
	}
}


