package com.demo.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.spring.boot.model.Product;
import com.demo.spring.boot.service.ProductService;

@RequestMapping("/product")
@RestController
public class HomeController {
	
	
	@Autowired
	private ProductService productService;
	
	 @PostMapping("/addProduct")
	 public String addProduct(@RequestBody Product product) {
		 String response="";
		 System.out.println("In Controller");
		 System.out.println(product);
		boolean respon = productService.add(product);
		System.out.println("response: " + respon);
		if(respon ==true) {
			 System.out.println("product added successfully");
			 response = "success";
		}
		else {
			System.out.println("failure while adding the product");
			response = "failure";
		}
		 return response;
	 }
	 @DeleteMapping("/deleteProduct")
	 public String deleteProduct(@RequestBody Product product) {
		 String response="";
		 System.out.println("In Controller");
		 System.out.println(product);
		boolean respon = productService.delete(product);
		if(respon ==true) {
			 System.out.println("product deleted successfully");
			 response = "success";
		}
		else {
			System.out.println("failure while deleting the product");
			response = "failure";
		}
		
		return response;
	 }
	 
	 @PutMapping("/updateProduct")
	 public String updateProduct(@RequestBody Product product) {
		 String response="";
		 System.out.println("In Controller");
		 System.out.println(product);
		boolean respon = productService.update(product);
		if(respon ==true) {
			 System.out.println("product updated successfully");
			 response = "success";
		}
		else {
			System.out.println("failure while updating the product");
			response = "failure";
		}
		
		return response;
	 }
}
