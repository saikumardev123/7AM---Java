
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer, String>();
		
		 hm.put(105, "Naveen");
		 hm.put(101, "Kiran");
		 hm.put(104, "Anil");
		 hm.put(102, "Rajesh");
		 hm.put(103, "Nikhil");
		 System.out.println(hm);
		 System.out.println(hm.get(104));
		
	}
}

