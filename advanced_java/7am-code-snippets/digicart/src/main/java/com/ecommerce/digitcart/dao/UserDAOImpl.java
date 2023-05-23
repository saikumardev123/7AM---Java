package com.ecommerce.digitcart.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.digitcart.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean register(User user) {
		   boolean result = false;
		 Session session =  sessionFactory.openSession();
		  Transaction transaction =  session.beginTransaction();
		 int id= (int) session.save(user);
		 transaction.commit();
		 if(id !=0) {
			  result = true;
		 }
		
		return result;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		
		Session session= sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		
		String HQLQuery = "select password from User where username=:username";
		Query query = session.createQuery(HQLQuery);
		
		query.setParameter("username", user.getUsername());
		transaction.commit();
		String pass= query.getSingleResult().toString();
		
			  if(user.getPassword().contentEquals(pass)){
				     result = true;
			  }
		
		return result;
	}
}
