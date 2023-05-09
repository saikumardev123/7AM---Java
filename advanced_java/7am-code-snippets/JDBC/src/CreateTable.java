import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root","ipl2021@dubai");
	   Statement statement =   connection.createStatement();
	   statement.execute("create table movies(id int, name varchar(40), runtime int)");
		}catch(Exception e) {
			 System.out.println(e);
		}
		
	}
	
}
