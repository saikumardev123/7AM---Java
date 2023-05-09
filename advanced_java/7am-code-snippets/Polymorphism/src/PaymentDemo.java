import java.util.Scanner;

class CashOnDelivery{
	
	   String address;
	   String contactNumber;
	public CashOnDelivery(String address, String contactNumber) {
		super();
		this.address = address;
		this.contactNumber = contactNumber;
	}
	   
}

class CreditCard{
	
	long accountNumber;
	short cvv;
	String nameOnTheCard;
	public CreditCard(long accountNumber, short cvv, String nameOnTheCard) {
		super();
		this.accountNumber = accountNumber;
		this.cvv = cvv;
		this.nameOnTheCard = nameOnTheCard;
	}
	
}

class DebitCard{
	long accountNumber;
	short cvv;
	String nameOnTheCard;
	public DebitCard(long accountNumber, short cvv, String nameOnTheCard) {
		super();
		this.accountNumber = accountNumber;
		this.cvv = cvv;
		this.nameOnTheCard = nameOnTheCard;
	}
	
	
}
class Gpay{
	
	 long mobileNumber;
	 String qrCode;
	public Gpay(long mobileNumber, String qrCode) {
		super();
		this.mobileNumber = mobileNumber;
		this.qrCode = qrCode;
	}
	 
}

class Payment{
	
	  public void pay(CashOnDelivery cashOnDelivery) {
		  
		   System.out.println("You have selected CashOnDelivery and below are the details:");
		   System.out.println(cashOnDelivery.address);
		   System.out.println(cashOnDelivery.contactNumber);
		  
	  }
  public void pay(CreditCard creditCard) {
	  
	  System.out.println("You have selected CreditCard and below are the details:");
	  System.out.println(creditCard.accountNumber);
	  System.out.println(creditCard.nameOnTheCard);
		  
	  }
  public void pay(DebitCard debitCard) {
	  
	  System.out.println("You have selected DebitCard and below are the details:");
	  System.out.println(debitCard.accountNumber);
	  System.out.println(debitCard.nameOnTheCard);
	  
  }
  public void pay(Gpay gpay) {
	  
	  System.out.println("You have selected Gpay and below are the details:");
	  System.out.println(gpay.mobileNumber);
	  System.out.println(gpay.qrCode);
	  
	  
  }
	  
	
}


public class PaymentDemo {
	
	public static void main(String[] args) {
		
		Payment payment= new Payment();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Payment Modes");
		System.out.println("-------------------------------");
		System.out.println(" 1.Credit Card \n 2.Gpay \n 3.Debit Card \n 4.CashOnDelivery");
		System.out.println("Select your payment mode");
		 int choice =  sc.nextInt();
		 //	long accountNumber;
			//short cvv;
			//String nameOnTheCard;
		 switch(choice) {
		 
		 case 1:  System.out.println("Enter the below details");
		           System.out.println("Account Number:");
		            long accNo = sc.nextLong();
		            System.out.println("CVV:");
		            short cvv = sc.nextShort();
		            System.out.println("Name on the card:");
		            String name = sc.next();
		            CreditCard creditCard = new CreditCard(accNo, cvv, name);
		            payment.pay(creditCard);  break;
		            
		 case 2:  System.out.println("Enter the below details");
         System.out.println("Mobile Number:");
          long mobileNumber = sc.nextLong();
          System.out.println("QR Code:");
          String qrCode = sc.next();
             Gpay gpay = new Gpay(mobileNumber, qrCode);
          payment.pay(gpay);  break;
          
         
		 case 3:  System.out.println("Enter the below details");
         System.out.println("Account Number:");
          long accNo1 = sc.nextLong();
          System.out.println("CVV:");
          short cvv1 = sc.nextShort();
          System.out.println("Name on the card:");
          String name1 = sc.next();
          DebitCard debitCard = new DebitCard(accNo1, cvv1, name1);
          payment.pay(debitCard);  break;
          
		 case 4:  System.out.println("Enter the below details");
         System.out.println("Address:");
          String address = sc.next();
          System.out.println("Contact:");
          String contact = sc.next();
          CashOnDelivery cashOnDelivery = new CashOnDelivery(address,contact);
          payment.pay(cashOnDelivery);  break;
		      
		 }
		
	}

}
