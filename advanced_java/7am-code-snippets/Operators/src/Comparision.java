
class Customer{
	
	int id;
	String name;
}


public class Comparision {

	
	public static void main(String[] args) {
		  int a=100;
		  int b=200;
		  String c="100";
		  Comparision c1= new Comparision(); // addr -> x1
		  Comparision c2 = new Comparision(); // addr -> x2
		  Comparision c3 = c2;
		  System.out.println(a==b);
		  System.out.println(a>b);
		  System.out.println(a<b);
		  System.out.println(c1);
		  System.out.println(c2);
		  System.out.println(c1 == c2); // false
		  System.out.println(c2 == c3); // 
		
		  Customer customer1= new Customer();
		  customer1.id=101;
		  Customer customer2= new Customer();
		  customer2.id=101;
		  System.out.println(customer1 == customer2);
		  System.out.println(customer1.id == customer2.id);
		  System.out.println(customer1.id != customer2.id);
		 
		
	}

}
