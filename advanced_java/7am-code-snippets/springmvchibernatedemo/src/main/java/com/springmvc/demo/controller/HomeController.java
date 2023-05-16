package com.springmvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		if(response ==true) {
			 System.out.println("product added successfully");
			 
		}
		else {
			System.out.println("failure while adding the product");
		}
		 return "home";
	 }
	 
	 @PostMapping("/updateProduct")
	 public String updateProduct(@ModelAttribute Product product) {
		 System.out.println("updating a product");
		   productService.update(product);
		 return "home";
	 }
	 
	 @PostMapping("/deleteProduct")
	 public String deleteProduct(@ModelAttribute Product product) {
		    product.setPid(6);
		    product.setImageURL("fdxgchvjbk");
		    product.setName("SONY ZV-E10L Mirrorless Camera Body with 1650 mm Power Zoom Lens Vlog Camera  (Black)");
		    product.setPrice(7000);
		    product.setSeller("fdgh");
		    productService.delete(product);
		 return "home";
	 }
	 
	 @RequestMapping("/login")
	 public String login() {
		 System.out.println("Login called");
		 return "login";
	 }
	
}
