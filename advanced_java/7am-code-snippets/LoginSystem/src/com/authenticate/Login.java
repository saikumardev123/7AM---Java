package com.authenticate;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }
    
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	     
                PrintWriter out = resp.getWriter();
                out.print("<html>\n" + 
                		"<body>\n" + 
                		"<form action=\"./login\" method=\"post\">\n" + 
                		"    <label for=\"uname\"><b>Username</b></label>\n" + 
                		"    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" + 
                		"\n" + 
                		"    <label for=\"psw\"><b>Password</b></label>\n" + 
                		"    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" + 
                		"\n" + 
                		"    <button type=\"submit\">Login</button>\n" + 
                		"  </div>\n" + 
                		"</form>\n" + 
                		"</body>\n" + 
                		"</html>");
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("<h1>Post method called</h1>");
    	 
    	  String username =  req.getParameter("uname");
    	  String password = req.getParameter("psw");
    	  PrintWriter out = resp.getWriter();
    	  
    	  if(username.contentEquals("sai") && password.contentEquals("sai")) {
    		    out.print("<h1>Login Success! Redirecting to Dashboard");
    	  }
    	  else {
    		  out.print("<h1>Login Failure! Please try again!");
    	  }
    }

}
