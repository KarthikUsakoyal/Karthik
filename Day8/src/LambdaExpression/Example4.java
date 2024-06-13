package LambdaExpression;
@FunctionalInterface
interface Karthik{
	String S(String message);
}
public class Example4 {

	public static void main(String[] args) {
	  Karthik Person = (message)->{
		  String S1 = "I like RE, ";
		  String S2 = S1+message;
		  return S2;
	  };
System.out.println(Person.S("Himalayan"));

	}

}
