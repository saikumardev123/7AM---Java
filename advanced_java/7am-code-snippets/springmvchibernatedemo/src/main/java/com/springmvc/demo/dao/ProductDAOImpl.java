package com.springmvc.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.demo.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("inside DAO");
		System.out.println("sessionFactory" + sessionFactory);
		Session session = sessionFactory.openSession();
		try {
			session.save(product);
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		return false;
	}

}
