package com.springmvc.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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
	 @PostMapping("/authenticate")
	 public String authenticate(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String ui="";
		
		 if(username.contentEquals("digital") && password.contentEquals("lync")) {
			  ui="success";
		 }
		 else {
			 ui ="failure";
		 }
	              System.out.println("I am in authenticate function");
		 return ui;
		 
	 }
}
