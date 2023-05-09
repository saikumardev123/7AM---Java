

class Customer{
	String name;
	String accNo;
	long accBalance; 
	String address;
	
	public void withdraw(long amount) {
		this.accBalance = this.accBalance - amount;
	}
	
	public void deposit(long amount) {
		this.accBalance = this.accBalance + amount;
	}
}

class BranchManager{
	
}
 
public class BankingApp {

	public static void main(String[] args) {
		
		Customer customer1= new Customer();
		customer1.name = "kiran";
		customer1.accNo = "12356";
		customer1.accBalance = 9000;
		customer1.address ="Hyderabad";
		
		Customer customer2= new Customer();
		customer2.name = "rajesh";
		customer2.accNo = "878788";
		customer2.accBalance = 10000;
		customer2.address ="Hyderabad";
		
		System.out.println(customer1.accBalance);
		customer1.deposit(9000);
		System.out.println(customer1.accBalance);
		
		customer2.withdraw(2000);
		System.out.println(customer2.accBalance);
		
	}
	
}

/*
 *    product 1 ->  pid, name, price 
 *    product 2 -> pid , name, price 
 *    product 3 -> pid, name, price
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
