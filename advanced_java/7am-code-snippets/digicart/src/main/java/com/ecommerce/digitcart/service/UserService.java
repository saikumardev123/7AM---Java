package com.ecommerce.digitcart.service;

import com.ecommerce.digitcart.model.User;

public interface UserService {
	
	public boolean register(User user);
	public boolean login(User user);

}
