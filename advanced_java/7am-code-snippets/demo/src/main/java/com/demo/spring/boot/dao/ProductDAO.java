package com.demo.spring.boot.dao;

import com.demo.spring.boot.model.Product;

public interface ProductDAO {
	  public boolean add(Product product);
	  public boolean update(Product product);
	  public boolean delete(Product product);
}
