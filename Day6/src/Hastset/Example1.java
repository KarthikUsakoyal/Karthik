package Hastset;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		HashSet<String>N=new HashSet();
		N.add("krt");
		N.add("Ask");
		N.add("Eng");
		Iterator<String>I=N.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
		

	}

}
