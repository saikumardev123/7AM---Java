
public class StringsDemo {
	public static void main(String[] args) {
		
             String str= "hello how are you doing";
             int counter = 0;
             for(int index = 0; index < str.length(); index++) {
            	  if(str.charAt(index) == 'o') {
            		  counter++;
            	  }
             }
             System.out.println(counter);
	}
}
