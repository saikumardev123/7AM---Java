import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
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
		 *  methods to perform the operations on ArrayList
		 * 
		 */
		
	}

}
