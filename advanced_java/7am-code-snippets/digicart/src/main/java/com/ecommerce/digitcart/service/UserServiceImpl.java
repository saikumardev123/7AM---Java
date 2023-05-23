package com.ecommerce.digitcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.digitcart.dao.UserDAO;
import com.ecommerce.digitcart.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public boolean register(User user) {
		 return userDAO.register(user);
		
	}
	
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return userDAO.login(user);
	}

}
