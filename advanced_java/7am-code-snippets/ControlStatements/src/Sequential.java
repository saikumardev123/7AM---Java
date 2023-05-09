import java.util.Scanner;

public class Sequential {
	
	 public static void main(String[] args) {
		
		 // IF-ELSE
		 
//	    Scanner sc= new Scanner(System.in);
//	    
//	    System.out.println("Enter username");
//	    
//	     String username =  sc.next();
//	     
//	     System.out.println("Enter password");
//	     
//	     String password = sc.next(); 
//	    
//	     System.out.println(username + "\t" + password);
//	     
//	      if(username.contentEquals("digitallync") && password.contentEquals("digitallync@123")) {
//	    	  System.out.println("login success");
//	      }
//	      else {
//	    	  System.out.println("login failure");
//	      }
//	     
//	      sc.close();
	   String choice= "java";
	   switch(choice) {
	   case  "java": System.out.println("You chose java"); break;
	   case  "dotnet": System.out.println("You chose dotnet"); break;
	   case  "react": System.out.println("You chose react"); break;
	   case  "angular": System.out.println("You chose angular"); break;
	   default : System.out.println("wrong choice");
	   
	   }
		 
	}

}
