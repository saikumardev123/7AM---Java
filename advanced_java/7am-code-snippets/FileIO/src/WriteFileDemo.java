
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
	
	public static void main(String[] args) throws IOException {
		    FileOutputStream fos = new FileOutputStream("/Users/saikumar/Desktop/Java-7AM/7am-code-snippets/FileIO/src/new.txt");
		     String msg= "hello world!";
		   // fos.write(65);
		     byte[] data=  msg.getBytes();
		     fos.write(data);
		    System.out.println("done");
		    fos.close();
		
	}
}
