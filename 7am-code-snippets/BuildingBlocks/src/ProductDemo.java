
class Product{
	 static String pid; // 
	static String name;
	 static long price; // 0
}
public class ProductDemo {
	public static void main(String[] args) {
		Product p1= new Product();
		p1.pid="101x";
		p1.price=2000;
		p1.name = "Prod1";
		System.out.println(p1.pid);
		System.out.println(p1.price);
		System.out.println(p1.name);
		System.out.println("---------------------");
		Product p2= new Product();
		p2.pid="200";
		p2.price=4000;
		p2.name = "Prod2";
		System.out.println(p2.pid);
		System.out.println(p2.price);
		System.out.println(p2.name);
		System.out.println("---------------------");
		System.out.println(p1.pid); // 
		System.out.println(p1.price);
		System.out.println(p1.name);
		
	}
	
}
