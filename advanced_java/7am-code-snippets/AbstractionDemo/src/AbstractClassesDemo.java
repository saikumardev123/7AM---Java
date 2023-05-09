
interface A1{
	 void m1();
	 void m2();
	 void m3();
}

abstract class A1Impl implements A1{
	public void m1() {
		System.out.println("m1()");
	}
	public void m2() {
		System.out.println("m2()");
	}
	
	public abstract void m3();
}

class A1ImplChild extends A1Impl{
	public  void m3() {
		
		System.out.println("m3()");
	}
}

public class AbstractClassesDemo {
	public static void main(String[] args) {
		A1 a = new A1ImplChild();
		a.m1();
		a.m2();
		a.m3();
	}

}
