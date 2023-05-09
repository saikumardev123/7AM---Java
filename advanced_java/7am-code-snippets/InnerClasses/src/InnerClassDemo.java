
class Outer{
	
	static int a=10;
	static int b=20; 
	
	private class Inner{
		 
		     void inner() {
		    	 int c=30,d=40;
		    	 System.out.println(a);
		    	 System.out.println(b);
		    	 System.out.println(c);
		    	 System.out.println(d);
		    	 
		     }	 
	 }
	void accessToInner() {
		Inner in = new Inner();
		in.inner();		
	}
}

public class InnerClassDemo {
	
	public static void main(String[] args) {
		
		Outer outer =new Outer();
		outer.accessToInner();
		
	}

}
