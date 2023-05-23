package com.ecommerce.digitcart.dao;

import com.ecommerce.digitcart.model.User;

public interface UserDAO {
	
	public boolean register(User user);
	public boolean login(User user);
	
}
