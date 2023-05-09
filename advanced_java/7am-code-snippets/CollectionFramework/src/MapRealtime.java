import java.util.HashMap;

class Customer{
	
	private int customerId;
	private String name;
	private long accountNumber;
	public Customer(int customerId, String name, long accountNumber) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.customerId + "\t"+ this.name + "\t"+ this.accountNumber;
	}	
}
public class MapRealtime {
	
	public static void main(String[] args) {
		
		Customer c1= new Customer(10913, "Kiran", 98998999);
		Customer c2= new Customer(13913, "Rajesh", 78998999);
		Customer c3= new Customer(10983, "anil", 99998999);
		
		 HashMap<Integer,Customer> hm= new HashMap<Integer,Customer>();
		 hm.put(101, c1);
		 hm.put(102, c2);
		 hm.put(103, c3);
		 
		 System.out.println(hm.get(101));
		 
		
		
		
	}

}
