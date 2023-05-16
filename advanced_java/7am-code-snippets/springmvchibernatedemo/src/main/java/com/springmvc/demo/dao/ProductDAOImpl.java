package com.springmvc.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.demo.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(Product product) {
		boolean result= false;
		// TODO Auto-generated method stub
		System.out.println("inside DAO");
		System.out.println("sessionFactory" + sessionFactory);
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			int i= (int)session.save(product);
			if(i !=0) {
				result = true;
			}
			transaction.commit();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		return result;
	}

	@Override
	public boolean update(Product product) {
		boolean result= true;
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.update(product);
			transaction.commit();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		
		return result;
	}

	@Override
	public boolean delete(Product product) {
		boolean result= true;
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.delete(product);
			transaction.commit();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		
		return result;
	}

}
