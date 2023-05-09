

class Add{
	
	 public void add(int a,int b) {
		  System.out.println(a+b);
	 }
	 
	 public void add(int a,int b, int c) {
		  System.out.println(a+b+c);
	 }
	 public void add(float a,float b) {
		  System.out.println(a+b);
	 }
	 public void add(float a,float b, float c) {
		  System.out.println(a+b+c);
	 }
}


public class MethodOverload {
	
	public static void main(String[] args) {
		
		Add a = new Add();
		
		a.add(10, 20);
		a.add(10.12f, 10.3f);
		a.add(10, 20,30);
		
	}

}
