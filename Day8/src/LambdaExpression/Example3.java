package LambdaExpression;
interface adding{
	int add(int a, int b);
}
public class Example3 {

	public static void main(String[] args) {
	adding ad1=(a,b)->(a+b);
System.out.println(ad1.add(50, 25));
adding S2=(a,b)->(a-b);
System.out.println(S2.add(100,5));
	}
}
