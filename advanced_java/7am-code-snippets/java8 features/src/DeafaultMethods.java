
interface A{
	  public void m1();
	  public default void m2() {
		    System.out.println("I am a default method");
	  }
}

class B implements A{
	 public void m1() {
		   System.out.println("m1()");
	 }
	 public void m2() {
		 System.out.println("m2() of B");
	 }
}


class C implements A{

	@Override
	public void m1() {
		System.out.println("m1() of C");
		
	}
	
}
public class DeafaultMethods {

	 public static void main(String[] args) {
		A aa= new B();
		aa.m1();
		aa.m2();
		C c1= new C();
		c1.m2();
	}
		
}
