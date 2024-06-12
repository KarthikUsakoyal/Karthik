package NestedTry;

public class Example2 {

	public static void main(String[] args) {
		try {
			try {
				try {
					int K[]= {1,2,3,4};
					System.out.println(K[10]);
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("inner try block2");
				}
			}
			catch(ArrayIndexOutOfBoundsException L) {
				System.out.println(L);
				System.out.println("outer try block");
			}
		}
			catch(Exception K) {
				System.out.println("Exception");
				System.out.println("Handled in main try block");
			}
		}

	}


