public class TryCatchFinallyDemo{
	 public static void main(String[] args) {
		 int arr[] = {1,2};
		  try {
			  System.out.println("Opening DB Connection");
			  System.out.println(arr[4]);
			  System.out.println(arr[7]);
		  }
		  catch(Exception exception) {
			  System.out.println(exception);
			  // error Simulation 
			  try {
			  System.out.println(arr[9]);
			  }catch(Exception e) {
				  System.out.println(e);
			  }
		  }
		  finally {
			  System.out.println("Closing DB Connection");
		  }
		 
		  System.out.println(arr[1]);
		  System.out.println(arr[0]);	  
	}
}
