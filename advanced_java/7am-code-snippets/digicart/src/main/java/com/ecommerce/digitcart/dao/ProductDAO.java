package com.ecommerce.digitcart.dao;

import java.util.List;

import com.ecommerce.digitcart.model.Product;

public interface ProductDAO {
   public boolean add(Product product);
   public List<Product> list();
   public boolean update(Product product);
   public boolean delete(Product product);
}
