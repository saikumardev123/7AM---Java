package com.ecommerce.digitcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.digitcart.model.User;
import com.ecommerce.digitcart.service.UserService;
import com.ecommerce.digitcart.utils.Response;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/healthcheck")
	 public String healthCheck() {
		 System.out.println("----------healthcheck-------------");
		 return "App is running successfully";	
	 }
	@PostMapping("/register")
	 public ResponseEntity<Object> register(@RequestBody User user) {
		System.out.println("----------register-------------");
		     System.out.println(user.getEmail());
		    boolean result =  userService.register(user);
		    
		    Response response = null;
		    
		    if(result == true) {
		    	  response= new Response();
		    	  response.setMessage("registered successfully!");
		    	  response.setOperationStatus("success");
		    	
		    	return new ResponseEntity<Object>(response,HttpStatus.OK);
		    }
		    else {
		    	response= new Response();
		    	  response.setMessage("registration failed!");
		    	  response.setOperationStatus("failure");
		    	return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		    }
		 
		 
	 }
	
	@PostMapping("/login")
	 public ResponseEntity<Object> login(@RequestBody User user) {
	
		    boolean result = userService.login(user);
		     Response response = null;
			    
			    if(result == true) {
			    	  response= new Response();
			    	  response.setMessage("login success!");
			    	  response.setOperationStatus("success");
			    	
			    	return new ResponseEntity<Object>(response,HttpStatus.OK);
			    }
			    else {
			    	response= new Response();
			    	  response.setMessage("login failed!");
			    	  response.setOperationStatus("failure");
			    	return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
			    }
		
	}
	
	
}

