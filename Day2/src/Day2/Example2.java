package Day2;
abstract class Bike1{
	Bike1(){System.out.println("Bike is Created");}
	abstract void run();
    void changegear(){System.out.println("Gear Changed");}	
}
class RE extends Bike1{
	void run(){System.out.println("Running Safely");}
}
public class Example2 {

	public static void main(String[] args) {
		Bike1 obj = new RE();
		obj.run();
		obj.changegear();

	}

}

