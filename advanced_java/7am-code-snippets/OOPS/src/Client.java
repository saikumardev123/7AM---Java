
public class Client {
	
	public static void main(String[] args) {
		Customer account1 = new Customer("IC101", "Kiran", "Hyderabad", 90111111, 10000, "ICICI", "hitech city", "ICICI12344","Savings");
		Customer account3 = new Customer("IC101", "Kiran", "Hyderabad", 90111113, 10000, "ICICI", "hitech city", "ICICI12344","Current");
		Customer account2 = new Customer("HDFC102", "Kiran", "Hyderabad", 45320113, 30000, "HDFC", "Madhapur", "HDFC103455","Savings");
		Customer account4 = new Customer("HDFC105", "Rahul", "Hyderabad", 4555320113L, 50000, "HDFC", "Madhapur", "HDFC103455","Savings");
		
		 account1.fundTransfer(account3, 9000);
		 System.out.println(account1.accountBalance);
		 System.out.println(account3.accountBalance);
		 account3.fundTransfer(account4, 10000);
		 System.out.println(account3.accountBalance);
		 System.out.println(account4.accountBalance);
		 
		
	}

}
