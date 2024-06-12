package Collections;
import java.util.*;

public class SortDescendingOrder {

	public static void main(String[] args) {
	 ArrayList<Integer> A =new ArrayList<Integer>();
	 A.add(12);
	 A.add(25);
	 A.add(36);
     A.add(10);
     Collections.sort(A);
     for(Integer number:A) {
    	 System.out.println(number);
     }
     Collections.reverse(A);
     for(Integer number:A) {
    	 System.out.println(number);
     }
	}

}
