package ThrowandThrows;

public class Example1 {
	static void method() throws ArithmeticException{
		System.out.println("Inside themethod()");
		throw new ArithmeticException("Throwing ArithmeticException");
	}

	public static void main(String[] args) {
		try {
			method();
		}
		catch(ArithmeticException e) {
			System.out.println("Caught");
		}

	}

}
