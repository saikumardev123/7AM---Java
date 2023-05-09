
public class StringBufferDemo {

	public static void main(String[] args) {
	
		 StringBuffer str=new StringBuffer("hello");
		 System.out.println(str);
		 str.append("world");
		 System.out.println(str);
		 
		 
		 StringBuilder str2=new StringBuilder("hello");
		 System.out.println(str2);
		 str2.append("world");
		 System.out.println(str2);
	}
	
}
