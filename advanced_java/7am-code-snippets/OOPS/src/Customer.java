
public class Customer extends Bank{
	public String customerId;
	public String name;
	public String address;
	public long accountNumber;
	public long accountBalance;
	public String accountType;
	public Customer(String customerId, String name, String address, long accountNumber, long accountBalance,String nameOfTheBank, String branch, String ifscCode,String accType) {
		super(nameOfTheBank,branch,ifscCode);
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountType = accType;
	}
	
	 void fundTransfer(Customer recieverAccount, long amount) {
		  if(recieverAccount == null) {
			  System.out.println("reciever account is invalid");
			  return;
		  }
		  if(amount <= 0) {
			  System.out.println("Amount cannot be 0 or less than 0");
			  return;
		  }
		  if(amount > this.accountBalance) {
			   System.out.println("enter amount is greater than your balance");
			   return;
		  }
		 this.accountBalance = this.accountBalance - amount; 
		 recieverAccount.accountBalance = recieverAccount.accountBalance + amount;
	 }
	 
	 void updateAccount() {
		 
		 //logic
	 }
	
}
