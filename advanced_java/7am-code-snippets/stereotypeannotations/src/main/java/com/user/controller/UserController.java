package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.user.model.User;
import com.user.service.UserService;
import com.user.service.UserServiceImpl;

@Controller
public class UserController {

	     private UserService userService = new UserServiceImpl();
	 
	   public void addUser(User user) {
		   
		     System.out.println("In Controller");
		   
		    userService.add(user);
		   
	   }
}
