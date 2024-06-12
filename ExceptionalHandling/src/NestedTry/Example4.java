package NestedTry;

public class Example4 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Divide by 0");
				int b= 39/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int A[]=new int[6];
				A[6]=4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Karthik");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Congratulations");
	

	}

}
