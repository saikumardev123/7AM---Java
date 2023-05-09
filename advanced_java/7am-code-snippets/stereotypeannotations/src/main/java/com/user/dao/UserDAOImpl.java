package com.user.dao;

import org.springframework.stereotype.Repository;

import com.user.model.User;

@Repository
public class UserDAOImpl  implements UserDAO{

	public void add(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("In DAO Impl");
		System.out.println(user.getEmail() + "\t"+ user.getName());
		
	}

	public void all() {
		// TODO Auto-generated method stub
		
	}

}
