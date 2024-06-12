package Name;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, choice;
        
        
        System.out.println(" 1 Male");
        System.out.println(" 2  Female:");
        choice = sc.nextInt();
        
       
        System.out.println("Enter your age:");
        age = sc.nextInt();
        
        
        if (age >= 18) {
            switch (choice) {
                case 1:
                case 2:
                    System.out.println("Ready to vote"+" === > "+choice);
                    break;
                default:
                    System.out.println("Invalid choice"+" === > "+choice);
            }
        } else {
            System.out.println("Not eligible to vote"+" === > "+choice);
        }
        
        sc.close();
    }
}
