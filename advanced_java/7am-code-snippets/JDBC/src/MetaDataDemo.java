import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaDataDemo {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root","ipl2021@dubai");
			 // Database Meta Data
			DatabaseMetaData databaseMetaData =	connection.getMetaData();
		  System.out.println(databaseMetaData.getDatabaseProductName());
		  System.out.println(databaseMetaData.getDatabaseProductVersion());
		  
		  // ResultSet Meta Data
		        Statement statement = connection.createStatement();
		        
		       ResultSet resultSet =   statement.executeQuery("select * from movies");
		       
		      ResultSetMetaData rsmd =  resultSet.getMetaData();
		
		     System.out.println(rsmd.getColumnCount());
		     
		     System.out.println(rsmd.getColumnLabel(2));
		     
		     
		  
		}catch(Exception e) {
			  System.out.println(e);
		}
		
	}

}
