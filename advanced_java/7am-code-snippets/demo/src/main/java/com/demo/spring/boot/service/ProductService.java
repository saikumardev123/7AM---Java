package com.demo.spring.boot.service;

import com.demo.spring.boot.model.Product;

public interface ProductService {

	public boolean add(Product product);
	 public boolean update(Product product);
	 public boolean delete(Product product);
	
}
