package Hastset;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		HashSet<String> K=new HashSet<String>();
        K.add("India");
        K.add("Australia");
        K.add("Srilanka");
        K.add("USA");
        System.out.println("Countries" + K);
        K.remove("USA");
        System.out.println("Current Countries ="+ K);
        HashSet<String>K1=new HashSet<String>();
        K1.add("Newzealand");
        K1.add("Germny");
        K.addAll(K1);
        System.out.println("Current List = "+ K);
        K.removeAll(K1);
        System.out.println("After Removing="+K);
        K.removeIf(str->str.contains("Australia"));
        System.out.println("After RemoveIf= "+ K);
        K.clear();
        System.out.println("After Clear = " + K);
	}

}
