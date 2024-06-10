package Collections;
import java.util.*;
public class EX4 {

	public static void main(String[] args) {
		LinkedList<String>A=new LinkedList<String>();
		System.out.println("Initial elements " + A);
		A.add("Nani");
		A.add("Shiva");
		A.add("Ashok");
		System.out.println("After invoking add(E a) method:"+A);
		A.add(1,"Manoj");
		System.out.println("After invoking add(int index, E element) method:"+A);
        LinkedList<String>K=new LinkedList<String>();
        K.add("Sai");
        K.add("Mahesh");
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ K);
        LinkedList<String>M=new LinkedList<String>();
        M.add("Jatin");
        M.add("Vihaan");
        K.addAll(1,M);
        System.out.println("After invoking add All()int index, Collection<?extendsE>c)method:"+K);
        K.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: "+K);
        K.addLast("Byju");
        System.out.println("After invoking addLast(E e) method: "+K);
	
	}

}
