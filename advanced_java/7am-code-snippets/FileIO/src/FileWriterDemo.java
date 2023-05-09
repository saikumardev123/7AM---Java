import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
	
		 FileWriter fw = new FileWriter("/Users/saikumar/Desktop/Java-7AM/7am-code-snippets/FileIO/src/users.txt");
	
		 fw.write("naveen, nikhil, rajesh, rahul");

		 fw.flush();
		 
		 fw.close();
		 System.out.println("done");
	}

}
