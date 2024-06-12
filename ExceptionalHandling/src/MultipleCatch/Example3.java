package MultipleCatch;

public class Example3 {

	public static void main(String[] args) {
	   try {
		   int K[]=new int[5];
		   K[5]=1/0;
	   }
	   catch(ArithmeticException e) {
		   System.out.println("Naveen");
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Aravind");
	   }
	   catch(Exception e) {
		   System.out.println("Karthik");
	   }

	}

}
