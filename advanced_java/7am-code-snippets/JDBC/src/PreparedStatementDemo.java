import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform", "root","ipl2021@dubai");
		PreparedStatement pstmt = connection.prepareStatement("insert into movies values(?,?,?)");
		pstmt.setInt(1, 101);
		pstmt.setString(2, "Movie 1");
		pstmt.setInt(3, 120);
		pstmt.executeUpdate();
		System.out.println("done");
			
		}catch(Exception e) {
			 System.out.println(e);
		}
		 
		
	}

}
