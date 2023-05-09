
class A{
	
	void getUsersById() {
		System.out.println("m1() of A called");
	}
	
}
class B extends A{
	
	@Override
	void getUsersById() { 
		System.out.println("m1() of B called");
	}
	
}

public class AnnotationDemo {
	
	public static void main(String[] args) {
		 B b=new B();
		 b.getUsersById();
	}

}
