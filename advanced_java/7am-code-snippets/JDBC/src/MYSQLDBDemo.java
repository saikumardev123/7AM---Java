import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDBDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
          // STEP1: Load the JDBC Driver
		   Class.forName("com.mysql.cj.jdbc.Driver");
		     // or
		/*
		 
		com.mysql.cj.jdbc.Driver driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.deregisterDriver(driver); 
		
		*/
		   // STEP2: provide URL, Username and password
		   // jdbc:<database>://<server address>:port/databasename
		  Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root", "ipl2021@dubai");
		  System.out.println(connection);
		  Statement statement =  connection.createStatement();
		  
		  //STEP3: Create a statement object to send SQL Queries.
		  try { 
			 // statement.execute("insert into users values(4, 'digitallync', 'digital123')");
			  
			  statement.execute("delet from users where userId=1");
		  }catch(Exception e) {
			     System.out.println(e);
		  }

		  System.out.println("some code");
		  
		  statement.close();
		  
		  connection.close();
		
	}

}
