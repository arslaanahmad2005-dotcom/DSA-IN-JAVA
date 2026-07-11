package DSA_Daily;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: "+ (a-b));
        System.out.println("Product: "+ (a*b));
        if(b==0) {
            System.out.println("Division by zero is not possible");
            
        }
        else{
            System.out.println("Quotient: "+ (a/b));
            System.out.println("Remainder: "+ (a%b));
        }
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else{
            if(a>b){
                System.out.println("The bigger number is first one: "+a);
            }
            else{
                System.out.println("The bigger number is second one: "+b);
            }
        }
        if(a%2==0){
            System.out.println("The first number is even");
        }
        else{
            System.out.println("The first number is odd");
        }
        
        sc.close();
    }
}
