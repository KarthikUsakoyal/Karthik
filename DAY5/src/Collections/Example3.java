package Collections;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		LinkedList<String>K=new LinkedList<String>();
		K.add("Aravind");
		K.add("Karthik");
		K.add("Naveen");
		Iterator<String>i=K.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
