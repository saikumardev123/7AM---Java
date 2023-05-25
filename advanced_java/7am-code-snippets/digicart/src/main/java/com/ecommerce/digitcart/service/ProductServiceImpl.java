package com.ecommerce.digitcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.digitcart.dao.ProductDAO;
import com.ecommerce.digitcart.model.Product;

@Service
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public boolean add(Product product) {
		
		return productDAO.add(product);
		
		
	}
	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return productDAO.list();
	}
	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("inside service");
		return productDAO.delete(product);
	}

}

