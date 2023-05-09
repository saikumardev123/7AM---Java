import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		
		 // HashSet 
		
		/*
		 *   Order of insertion is not guaranteed.
		 *   Can store any type of Object
		 *   Duplicate entries are not considered.
		 * 
		 */
		
		  HashSet<Object> hashSet = new HashSet<Object>();
		  
		  hashSet.add(10);
		  hashSet.add(20);
		  hashSet.add(40);
		  hashSet.add("hello");
		  hashSet.add(true);
		  hashSet.add(false);
		  hashSet.add(10);
		  hashSet.add(20);
		  hashSet.add(40);
		  hashSet.add("hello");
		  hashSet.add(true);
		  hashSet.add(false);
		  
		  hashSet.remove(true);
		 // System.out.println(hashSet);
		 
//		  System.out.println(hashSet);
//		  System.out.println(hashSet.contains("hello"));
//		  System.out.println(hashSet.isEmpty());
//		  System.out.println(hashSet.size());
		  
		  // Iterator
//		  
//		   Iterator<Object> it =  hashSet.iterator();
//		   while(it.hasNext()) {
//			  // System.out.println(it.next());
//			   System.out.println();
//		   }
		   
//		   ArrayList<Object> al= new ArrayList<Object>(hashSet);
//		   
//		   System.out.println(al);
//		   
//		   System.out.println(al.get(2));
		   
		   // LinkedHashSet 
		   
		   LinkedHashSet<Object> linkedhashSet = new LinkedHashSet<Object>();
		   linkedhashSet.add(10);
		   linkedhashSet.add(20);
		   linkedhashSet.add(40);
		   linkedhashSet.add("hello");
		   linkedhashSet.add(true);
		   linkedhashSet.add(false);
		   System.out.println("hey");
		   System.out.println("hello"+ linkedhashSet);
	}

}
