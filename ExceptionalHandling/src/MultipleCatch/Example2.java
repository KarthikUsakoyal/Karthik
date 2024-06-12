package MultipleCatch;

public class Example2 {

	public static void main(String[] args) {
	 try {
		 int k[]=new int[5];
		 k[5]=30/0;
	 }
	 catch(ArithmeticException e) {
		 System.out.println("Result = Infinite");
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("AIOBE Occored");
	 }
	 catch(Exception e) {
		 System.out.println("Exception Occured");
	 }
	 System.out.println("Remaining code");

	}

}
