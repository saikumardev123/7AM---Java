import java.util.*;

class SpaceNotAllowedException extends Exception{
     public SpaceNotAllowedException(String errorMessage) {
		// TODO Auto-generated constructor stub
    	 super(errorMessage);
	}
     
     
}


public class Test
{
	public static void main(String[] args)  {
		String user;
		System.out.println("enter name");
		Scanner sc = new Scanner(System.in);
		user = sc.nextLine();
		try {
			 if(user.contains(" "))
	            {
	                throw new SpaceNotAllowedException("contains spaces");
	            }
		}
		catch(SpaceNotAllowedException spc) {
			  System.out.println(spc);
		}
		           
		           System.out.println("other code");
	}
}