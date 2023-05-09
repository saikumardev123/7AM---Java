
class PasswordException extends RuntimeException{
     public PasswordException(String errorMessage) {
		// TODO Auto-generated constructor stub
    	 super(errorMessage);
	}
}

public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		
		 String password= "sjbkjs"; 
		 
		 try {
		 if(password.length() < 8) {
			 throw new PasswordException("Password should be atleast 8 chars");
		 }
		 }catch(PasswordException exception) {
			 System.out.println(exception);
		 }
		 
		 System.out.println("username check");
		
	}
	
	

}
