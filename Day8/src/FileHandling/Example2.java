package FileHandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
	try(FileReader fr = new FileReader("\"C:\\Users\\karth\\Documents\"")){
		int letters = fr.read();
		while(fr.ready()) {
			System.out.println((char)letters);
			letters = fr.read();
		}
	
	// fr.close();
	System.out.println();
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	}

}
