package Interface;
interface Bikes{
	void print();
}
class GT implements Bikes{
	public void print() {System.out.println("My Fav Bike is GT");}
}
public class Example1 {

	public static void main(String[] args) {
		GT obj = new GT();
		obj.print();

	}

}
