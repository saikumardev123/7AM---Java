package com.demo.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.boot.dao.ProductDAO;
import com.demo.spring.boot.model.Product;


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

	@Transactional
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return productDAO.update(product);
	}

    @Transactional
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return productDAO.delete(product);
	}

}
