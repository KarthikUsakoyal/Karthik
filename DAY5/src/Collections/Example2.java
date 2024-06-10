package Collections;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Pineapple");// TODO Auto-generated method stub
		al.add("Watermelon");
		al.add("Strawberry");
		al.add("Blueberry");
		System.out.println("Returning element:"+al.get(1));
		al.set(1, "Dates");
		for(String fruit:al) {
			System.out.println(fruit);
		}
			
	}

}
