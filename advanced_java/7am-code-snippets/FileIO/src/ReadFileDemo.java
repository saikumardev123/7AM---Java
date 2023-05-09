import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("/Users/saikumar/Desktop/Java-7AM/7am-code-snippets/FileIO/src/abc.txt");
		int i=0; 
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}
	
}
