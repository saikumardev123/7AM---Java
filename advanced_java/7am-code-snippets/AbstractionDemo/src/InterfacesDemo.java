
interface A{
	void m1();
	void m2();
	void m3();
}

class Aimpl implements A{
	
	public void m1() {
		
		System.out.println("m1()");
		
	}
	public void m2() {
	
		System.out.println("m2()");
	}
	public void m3() {
		
		System.out.println("m3()");
	}
	
}
public class InterfacesDemo {
	
	public static void main(String[] args) {
		
		A aa= new Aimpl();
		aa.m1();
		aa.m2();
		aa.m3();
		
	}

}
