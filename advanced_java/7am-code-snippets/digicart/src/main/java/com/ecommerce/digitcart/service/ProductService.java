package com.ecommerce.digitcart.service;

import java.util.List;

import com.ecommerce.digitcart.model.Product;

public interface ProductService {
	   public boolean add(Product product);
	   public List<Product> list();
	   public boolean update(Product product);
	   public boolean delete(Product product);
	}

