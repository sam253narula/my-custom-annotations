package com.custom.annotation.createmyownannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custom.annotation.createmyownannotation.service.ServiceExample;

@RestController
@RequestMapping("/home")
public class ExampleController {
	@Autowired
	ServiceExample serviceExample;
	@GetMapping
	public String Test() {
		return serviceExample.helloUser();
	}
}
