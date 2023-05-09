
@FunctionalInterface
interface Login{
	  boolean authenicate(String username, String password);
}


public class FI {

	public static void main(String[] args) {
		
		Login login= (String username, String password) ->  username.contentEquals("sai") && password.contentEquals("sai");
	
		
		System.out.println(login.authenicate("sa4i", "sai"));
		
	}
	
}
