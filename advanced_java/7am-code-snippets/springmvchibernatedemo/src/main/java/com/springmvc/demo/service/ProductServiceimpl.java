package com.springmvc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.demo.dao.ProductDAO;
import com.springmvc.demo.dao.ProductDAOImpl;
import com.springmvc.demo.model.Product;

@Service
public class ProductServiceimpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Transactional
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Inside service");
		return productDAO.add(product);
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return productDAO.update(product);
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return productDAO.delete(product);
	}

}
