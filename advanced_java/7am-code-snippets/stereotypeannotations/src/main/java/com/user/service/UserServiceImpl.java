package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.dao.UserDAOImpl;
import com.user.model.User;

@Service
public class UserServiceImpl  implements UserService{

	//@Autowired
	 private UserDAO userDAO = new UserDAOImpl();
	
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("In Service");
		
		userDAO.add(user);
		
	}

	public void all() {
		// TODO Auto-generated method stub
		
	}

}
