import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedExceptions {
	public static void main(String[] args) throws IOException  {
		  
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter first value");
		int firstValue = Integer.parseInt(reader.readLine());
	System.out.println("Enter second value");
	  int secondValue = Integer.parseInt(reader.readLine());
	  try {
		  int result =  firstValue/secondValue;
		     System.out.println(result);
	  }
	  catch(Exception exception) {
		  
		  System.out.println(exception);
		  // add the log and store the error information.
		  
	  }
	     
	     System.out.println("some other operations");
	}
}
