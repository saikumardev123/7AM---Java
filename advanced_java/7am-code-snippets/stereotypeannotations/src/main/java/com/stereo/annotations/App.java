package com.stereo.annotations;

import com.user.controller.UserController;
import com.user.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	UserController controller = new UserController();
    	
    	  User user = new User();
    	  user.setEmail("kiran@gmail.com");
    	  user.setId(101);
    	  user.setName("kiran");
    	  user.setPassword("86889978");
    	
    	controller.addUser(user);
    	
    }
}
