package com.ecommerce.digitcart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.digitcart.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/healthcheck")
	 public String healthCheck() {
		 System.out.println("----------healthcheck-------------");
		 return "App is running successfully";	
	 }
	@PostMapping("/register")
	 public ResponseEntity register(@RequestBody User user) {
		System.out.println("----------register-------------");
		     System.out.println(user.getEmail());
		 return new ResponseEntity(HttpStatus.OK);
		 
	 }
}
