
class Customer {
	 int cid;
	 String name;
	 long accountBalance;
	 String idProof;
	 String incomeProof; 
	 String dobCertificate;
	 
	 // parameterized constructor
	  public Customer(int id, String name, long accountBalance,String idProof, String incomeProof,String dobCertificate) {
		
		    this.cid = id;
		    this.name = name;
		    this.accountBalance = accountBalance;
		  
	}
	  
	// overloaded constructor
		  public Customer(int id, String name, long accountBalance,String idProof) {
			
			    this.cid = id;
			    this.name = name;
			    this.accountBalance = accountBalance;
			    this.idProof = idProof;
			  
		}
}
public class ConstructorDemo {
	
	public static void main(String[] args) {
		
	       Customer customer = new Customer(101,"xyz",90900L,"adhaar");   
	       Customer customer2 = new Customer(102, "jsbdc",888l,"adhaar","someincomeproof","dob ceritificate");
	       
		   
		
	}

}
