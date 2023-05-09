package com.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	 @RequestMapping("/home")
	 public String home() {
	      System.out.println("Controller home called");
		 return "home";
		 
	 }
	 
	 @RequestMapping("/login")
	 public String login() {
		 System.out.println("Login called");
		 return "login";
	 }
	
}
