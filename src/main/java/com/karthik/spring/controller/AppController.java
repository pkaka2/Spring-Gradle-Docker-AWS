package com.karthik.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	
	@RequestMapping("/app")
	public String Springdocker(){
		
		return "SpringBoot Gradle Docker ";
	}

}
