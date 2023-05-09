import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
       	HashMap<Integer,String> hm = new HashMap<Integer, String>();
		 hm.put(104, "Anil");
		 hm.put(105, "Naveen");
		 hm.put(101, "Kiran");
		 hm.put(102, "Rajesh");
		 hm.put(103, "Nikhil");
		 System.out.println(hm);
		 System.out.println(hm.get(104));
		
	}
}

