


class Bank{	
	String bankName;
	String branch;
	Bank(String bankName, String branch){
		
		this.bankName = bankName;
		this.branch = branch;
	}
}

class Customer extends Bank{
	
	  String name;
	  String accId;
	  public Customer(String name, String accId, String bankName, String branch) {
		// TODO Auto-generated constructor stub
		  super(bankName,branch);
		  this.name= name;
		  this.accId = accId;
	}
	
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		
		Customer customer = new Customer("kiran","12344","hdfc","hitech city");
		System.out.println(customer.bankName + "\t"+ customer.name);
		
	}
	
}
