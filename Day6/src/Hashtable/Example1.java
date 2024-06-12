package Hashtable;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Hashtable<Integer,String>K=new Hashtable<Integer,String>();
        K.put(12, "Abhi");
        K.put(11, "Raju");
        for(Map.Entry m:K.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}
