package LambdaExpression;
import java.util.*;
public class Example5 {

	public static void main(String[] args) {
		List<String>K=new ArrayList<String>();
        K.add("Krishna");
        K.add("Sadhna");
        K.add("Ajith");
        K.add("Varun");
        K.forEach((n)->System.out.println(n)
        		);
	}
															
}
	