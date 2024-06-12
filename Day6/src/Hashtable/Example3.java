package Hashtable;
import java.util.*;
class Book{
	int id;
	String name, author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	} 
}

public class Example3 {

	public static void main(String[] args) {
	Map<Integer,Book>K=new Hashtable<Integer,Book>();
	Book B1=new Book(1,"Maths","Vikram","RK",20);
	Book B2=new Book(2,"Science","Karthik","UK",100);
	K.put(1, B1);
	K.put(2, B2);
	for(Map.Entry<Integer,Book>entry:K.entrySet()) {
		int k = entry.getKey();
		Book b=entry.getValue();
		System.out.println(K+ "Details:");
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}

	}

}
