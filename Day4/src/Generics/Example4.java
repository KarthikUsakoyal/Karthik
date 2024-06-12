package Generics;
import java.util.*;  
public class Example4 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Karthik");
		list.add("Aravind");
String k = list.get(0);
System.out.println("Element is :" + k);
Iterator<String>itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
