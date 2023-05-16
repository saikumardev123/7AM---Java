package com.springmvc.demo.dao;

import com.springmvc.demo.model.Product;

public interface ProductDAO {
	  public boolean add(Product product);
	  public boolean update(Product product);
	  public boolean delete(Product product);
}
