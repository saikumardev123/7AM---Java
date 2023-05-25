package com.ecommerce.digitcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.digitcart.model.Product;
import com.ecommerce.digitcart.service.ProductService;
import com.ecommerce.digitcart.utils.Response;



@RequestMapping("/product")
@RestController
public class ProductController {
	
	 @Autowired
	 private ProductService productService;
	 
	 @PostMapping("/add")
	 public ResponseEntity<Object> add(@RequestBody Product product) {
		  System.out.println("inside contoller");
		 System.out.println("product desc:"+product.getDescription());
		 
		boolean result = productService.add(product);
		
		 if(result == true) {
			Response response= new Response();
			response.setMessage("product added successfully");
			response.setOperationStatus("success");
			 return new ResponseEntity<Object>(response,HttpStatus.CREATED);
		 }
		 else {
			 Response response= new Response();
				response.setMessage("product adding failed");
				response.setOperationStatus("failure");
				 return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		 }
		 
	 }
	 
	 @DeleteMapping("/delete")
	 public ResponseEntity<Object> delete(@RequestBody Product product) {
		  System.out.println("inside controller");
		boolean result = productService.delete(product);
		
		 if(result == true) {
			Response response= new Response();
			response.setMessage("product deleted successfully");
			response.setOperationStatus("success");
			 return new ResponseEntity<Object>(response,HttpStatus.CREATED);
		 }
		 else {
			 Response response= new Response();
				response.setMessage("product deletion failed");
				response.setOperationStatus("failure");
				 return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);
		 }
		 
	 }
	 @GetMapping("/list")
	 public ResponseEntity<Object> list() {
		  System.out.println("inside controller");
		List<Product> products = productService.list();
		return new ResponseEntity<Object>(products,HttpStatus.OK);
		
	 }
	 
}
