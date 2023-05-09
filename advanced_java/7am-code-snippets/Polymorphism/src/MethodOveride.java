
class A{
	
	void m1(){
		System.out.println("This is m1()");
	}
	void m2() {
		System.out.println("This is m2()");
	}
	
}

class B extends A{
	
	void x() {
		System.out.println("x()");
	}
	void m2() {
		System.out.println("This is m2() in B");
	}
}

public class MethodOveride {

	public static void main(String[] args) {
		
//		B bb= new B();
//		bb.m1();
//		bb.m2();
//		
		A aa = new B(); // Dynamic Polymorphism
		aa.m2();
		
		
		
	}
	
}
