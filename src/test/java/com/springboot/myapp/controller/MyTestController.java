package com.springboot.myapp.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyTestController {
	
	@GetMapping(path = "/")
	public String welcome() {
		return "My test spring boot for OpenShift";
	}
	
	@GetMapping(path = "/{param}")
	public String welcome(@PathVariable String param) {
		return "My test spring boot for OpenShift "+param;
	}
}
