package Name;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int i,j,number;
	System.out.println("Enter a number");
	number=sc.nextInt();
	
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++)
		{
		if(j==1 || i+j==5 || (i==j && i>=4))
		{
		 System.out.print("*");
		 }
		else {
			System.out.print(" "); 
		}
		 
		}
		System.out.println(" ");
	}}
	
	}
