package com.crud;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;

	  Statement statement = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		  String username =  config.getInitParameter("username");
		  String password  = config.getInitParameter("password");
		  String url = config.getInitParameter("url");
		  String driverClassName = config.getInitParameter("driver");
		  
		  System.out.println(username + "\t"+ password);
		try {
		     Class.forName(driverClassName);
		    statement =  DriverManager.getConnection(url, username, password).createStatement();
		}catch(Exception e) {
			 System.out.println(e);
		}
	}

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get also called");
		PrintWriter out = resp.getWriter();
		out.println("<html>\n" + 
				" <head>\n" + 
				" </head>\n" + 
				" <body>\n" + 
				" <form action=\"./user\" method=\"get\">\n" + 
				" <input type=\"number\" name=\"userId\" placeholder=\"enter userId\"><br><br>\n" + 
				"  <input type=\"text\" name=\"username\" placeholder=\"enter username\"><br><br>\n" + 
				"   <input type=\"text\" name=\"password\" placeholder=\"enter password\"><br><br>\n" + 
				"   <button>Add User</button>\n" + 
				" </form>\n" + 
				" </body>\n" + 
				" </html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    int userId = Integer.parseInt(req.getParameter("userId"));
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String query= "insert into users values("+userId+",'"+username+"','"+password+"')";
		try {
			statement.execute(query);
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}   
}
