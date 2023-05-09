import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		
		// Password - min 1 uppercase,min 1 lowercase 
		
		// n+ Quantifier - atleast one n. 
//		boolean result = Pattern.compile("[A-Z]+[a-z]+").matcher("AAAAAGJDDHDJDHDHDHaaaa").matches();
//		System.out.println(result);
		
//		// n* - zero or more occurances 
//		
//		boolean result = Pattern.compile("[A-Z]+[a-z]*").matcher("AA").matches();
//		System.out.println(result);
		
		// n? - zero or one occurances 
//				boolean result = Pattern.compile("[A-Z]?[a-z]").matcher("AAAa").matches();
//				System.out.println(result);
		
//		// X{n} - fixing the number of char sequence - X{5} - Should have 5. 
//		
//		boolean result = Pattern.compile("[A-Z]{2}[a-z]").matcher("AAa").matches();
//		System.out.println(result);
//		
//		// X{n,m} - fixing the number of char sequence between n and m - X{5,10} - Should have BETWEEN 5 and 10. 
//				boolean result = Pattern.compile("[A-Z]{2,4}[a-z]").matcher("AAAAa").matches();
//				System.out.println(result);
				
//		
		
	 // X{n,} - min 5 and maximum can be any
				boolean result = Pattern.compile("[A-Z]{2,}[a-z]").matcher("AAAAAAAAAAAAAAa").matches();
				System.out.println(result);
		 
		
		
	}
}
