package com.springmvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.demo.model.Product;
import com.springmvc.demo.service.ProductService;

@Controller
public class HomeController {
	
	
	@Autowired
	private ProductService productService;
	
	 @RequestMapping("/home")
	 public String home(Model model) {
	      System.out.println("Controller home called");
	      Product product = new Product();
	      model.addAttribute("product", product);
		 return "home";
		 
	 }
	 @PostMapping("/addProduct")
	 public String addProduct(@ModelAttribute Product product) {
		 System.out.println("In Controller");
		 System.out.println(product);
		boolean response = productService.add(product);
		System.out.println("response: " + response);
		 return "home";
	 }
	 
	 @RequestMapping("/login")
	 public String login() {
		 System.out.println("Login called");
		 return "login";
	 }
	
}
