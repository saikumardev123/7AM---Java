import java.util.ArrayList;
import java.util.Iterator;

class Product{
	 private int id;
	 private String name;
	 private int price;
	 private String description;
	public Product(int id, String name, int price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"\t"+ this.name+"\t"+ this.price + "\t"+ this.description;
	}
	
}
public class ProductManagementSystem {
		public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		Product product1= new Product(101,"first product",1000,"product 1");
		Product product2= new Product(102,"second product",2000,"product 2");
		Product product3= new Product(103,"third product",3000,"product 3");
		Product product4= new Product(104,"fourth product",4000,"product 4");
		Product product5 = new Product(105,"fifth product",5000,"product 5");
		 al.add(product1);
		 al.add(product2);
		 al.add(product3);
		 al.add(product4);
		 al.add(product5);
		
		 ProductManagementSystem pm= new ProductManagementSystem();
		 pm.showProducts(al);
		 pm.removeProductById(102, al);
		
		 pm.removeProductById(105, al);
		 pm.showProducts(al);
		 
		 Product p6= new Product(101,"first product", 20000,"soem desc");
		 
		 pm.updateProduct(101,al,p6);
		 pm.showProducts(al);
		 
	}
		
	    void showProducts(ArrayList<Product> al) {
	    	 Iterator<Product> it = al.iterator();
	    	 while(it.hasNext()) {
	    		 System.out.println(it.next());
	    	 }
	    	 System.out.println("------------------------");
	    	
	    }
	    void removeProductById(int id, ArrayList<Product> al) {
	    	Iterator<Product> it = al.iterator();
	    	 while(it.hasNext()) {
	    		Product prod = (Product)it.next(); // 
	    		if(prod.getId() == id) {
	    			boolean result = al.remove(prod);
	    			if(result == true) {
	    				System.out.println("product removed");
	    				System.out.println("---------------------------");
	    				return;
	    			}
	    			else {
	    				System.out.println("product not removed");
	    			}
	    		}
	    	 }
	    }
	    // Implement update function
	    
	    void updateProduct(int id, ArrayList<Product> al, Product prod) {
	    	Iterator<Product> it = al.iterator();
	    	 while(it.hasNext()) {
	    		Product p = (Product)it.next();
	    		if(p.getId() == id) {
	    			 int index =  al.indexOf(p);
	    			  System.out.println(index);
	    			  al.remove(index);
	    			  al.add(index, prod);
	    			 return;
	    			
	    		}
	    	 }
	    	
	    	
	    }
	    
}


/*
 * 
 *      Iterator -> it iterates the data one by one(element)
 *      
 *      
 *      [1,2,3,4,5,5,6,6,67,7];
 *      
 *       hasNext() - , next() - 1,2,3,4,5,5,6,6,67,7
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
