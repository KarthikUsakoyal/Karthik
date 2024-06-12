package MultipleCatch;

public class Example1 {

	public static void main(String[] args) {
		try {
			int a[] = new int [5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE occured");
		}
		catch(Exception e) {
			System.out.println("Parent Exception Occured");
		}
        System.out.println("Remaining Code");
	}

}
