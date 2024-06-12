package Hashtable;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Hashtable<Integer,String>M=new Hashtable<Integer,String>();
        M.put(101,"Anurag");
        M.put(102, "Laddu");
        M.put(103,"Charan");
        System.out.println("Before:" + M );
        M.remove(101);
        System.out.println("After:" + M);

	}

}
