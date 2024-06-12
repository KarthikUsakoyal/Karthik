package Name;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int number=sc.nextInt();
		int [] a = new int [number];
        System.out.println("Elements of the array");
        for(int i = 1 ; i<number;i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int element=sc.nextInt();
        int place=-1;
        for(int i=0;i<number;i++)
        {
         if(element ==  a[i])
         {
        	 place=i;
        	 break;
         } 
        }
        if(place != -1)
        {
        	System.out.println("Element at position "+ place +"Selected no. is "+ element);
        }
        else
        {
        	System.out.println("element not found" + number);
        }
        sc.close();
	}

}
