import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOperations {
	
	static Connection connection=null;
	static Statement statement =null;
	
	public static void main(String[] args) {
		  getDatabaseConnection();
		  insertUser(6, "nikhil", "nikhil123");
		  //deleteUser(3);
		  //closeConnection();
		  //updateUser(4,null,"digitallync");
		  getAllUsers();	  
	}
	static void getDatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			CRUDOperations.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root","ipl2021@dubai");
			statement=connection.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void updateUser(int id,String username, String password) {
		//update users set username='kirankumar' where userId=1;
		 String query ="";
		 if(username == null && password != null) {
			query = "update users set password='"+password+"' where userId="+id;
			 System.out.println("query: "+ query);
		 }
		 else 
			 if(username !=null && password == null) {
				 query = "update users set username='"+username+"' where userId="+id;
				 System.out.println("query: "+ query);
			 }
		 try {
				statement.execute(query);
				 System.out.println("update done");
			}
			catch(Exception e) {
				System.out.println(e);
			}	
	}
	static void insertUser(int id,String username,String password) {
		String query = "insert into users values("+id+",'"+username+"','"+password+"')";
		try {
			statement.execute(query);
			 System.out.println("insertion done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	 static void deleteUser(int id) {
		 String query = "delete from users where userId="+id;
		 System.out.println("query:" + query);
			try {
				statement.execute(query);
				 System.out.println("user deleted successfully!");
			}
			catch(Exception e) {
				System.out.println(e);
			}
	 }
	 static void closeConnection() {
		 try {
			  connection.close();  
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
	 }
	 
	 static void getAllUsers()  {
		 try {
			 ResultSet rs=  statement.executeQuery("select * from users");
				System.out.println("userId           username               password");
				System.out.println("-----------------------------------------------------");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"       "+ rs.getString(3));
				}
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
		 
	 }
}
