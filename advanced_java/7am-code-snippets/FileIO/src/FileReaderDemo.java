
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("/Users/saikumar/Desktop/Java-7AM/7am-code-snippets/FileIO/src/users.txt");
	
		 int i=0;
		 while((i=fileReader.read()) !=-1) {
			  System.out.print((char)i); 
		 }
	}

}
