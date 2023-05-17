package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/healthcheck")
	public String healthCheck() {
		 System.out.println("Health check is invoked");
		return "App is Running Successfully";
	}
}

