import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<Object> al = new Vector<Object>();
		al.add(10);
		al.add("hello");
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		al.remove(2);
		al.remove(2);
		al.remove(2);
		al.add(2, "hey");
		System.out.println(al);
		
		/*
		 * 
		 *  Insertion order is guranteed
		 *  duplicate values allowed
		 *  it is a dynamic array
		 *  methods to perform the operations on Vector
		 *  Vector methods are synchronized (thread safe)
		 * 
		 */
		
	}

}
