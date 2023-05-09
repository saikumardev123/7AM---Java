
class Product{
	 int productId;
	 String name;
	 long price;
	 String seller;
}

public class IterativeStatements {
	
	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.productId = 101; product1.name="product 1"; product1.price=9000; product1.seller="seller 1";
		Product product2 = new Product();
		product2.productId = 102; product2.name="product 2"; product2.price=2000; product2.seller="seller 2";
		Product product3 = new Product();
		product3.productId = 103; product3.name="product 3"; product3.price=3000; product3.seller="seller 3";
		Product product4 = new Product();
		product4.productId = 104; product4.name="product 4"; product4.price=6000; product4.seller="seller 2";
		
		 Product[] products = {product1, product2,product3, product4};
		 
		  int index  = 0;
		  
		  while(index < products.length) {
			  
			  Product product = products[index]; 
			  System.out.println(product.productId + "\t"+product.name + "\t"+ product.price+"\t"+ product.seller);
		
			   index++;
		  
		  }
		 
		 
		
	}
}
