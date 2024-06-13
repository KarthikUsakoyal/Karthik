package LambdaExpression;
interface Bike{
	public void Honda();
}


public class Example2 {

	public static void main(String[] args) {
           String honda = "CBR";
		Bike RE = ()->{
			System.out.println("Bike "+ honda);
		};
          RE.Honda();  
	}

}
