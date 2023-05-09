import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class JumpStatements {
	 // helper methods
	 static boolean authenticateUser(String username, String password) {
		 if(username.contentEquals("digitallync") && password.contentEquals("digitallync")) {
			   return true;
		 }
		 else {
			 return false;
		 }
	 }
	 static int generateOtp(boolean isUserLoggedIn) {
		 //int otp = 0;
		 if(isUserLoggedIn) {
			 // code to generate OTP;
			return 1245;
		 }
		 else {
			 return 0;
		 } 
	 }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next(); 
		boolean result=authenticateUser(username, password);
		if(result) {
			System.out.println("user logged in successfully!!");
		}
		else {
			System.out.println("username/ password incorrect!");
		}
		
	      System.out.println(generateOtp(true));
		
	}

}
