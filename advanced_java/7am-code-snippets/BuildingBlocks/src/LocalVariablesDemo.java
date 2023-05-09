
public class LocalVariablesDemo {
	

	  public static int m1() {
		     int result =0;
		     if(20 < 200) {
		    	int a = 200 * 10; // blocked scoped variable
		    	System.out.println(a);
		    	 result = a;
		     }
		     return result;
	  }
	 
	public static void main(String[] args) {
		System.out.println(LocalVariablesDemo.m1());
	}
	
}
