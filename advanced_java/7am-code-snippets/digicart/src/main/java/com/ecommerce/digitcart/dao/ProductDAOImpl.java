package com.ecommerce.digitcart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.digitcart.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(Product product) {
		boolean result =false;
		 Session session=sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 int i= (int)session.save(product);
		 transaction.commit();
		 if(i !=0) {
			 result = true;
		 }
		return result;
	}

	@Override
	public List<Product> list() {
		 Session session=sessionFactory.openSession();
		  List<Product> list = session.createQuery("from Product").list();
		return list;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Product product) {
		System.out.println("inside DAO");
		boolean result =false;
		
		 Session session=sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 try {
			 Product pro = (Product)session.merge(product);
			 session.remove(pro);
			 transaction.commit();
			 result= true;
		 }
		 catch(Exception e) {
			  System.out.println(e);
			  result= false;
		 }
		return result;
	}

}
