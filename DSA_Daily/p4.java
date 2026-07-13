package DSA_Daily;
import java.util.*;
public class p4 {
    public static int Addition(int a,int b)
    {
        return a+b;
    }
    public static int Subtraction(int a,int b)
    {
        return a-b;
    }
    public static int Multiplication(int a,int b)
    {
        return a*b;
    }
    public static int Division(int a,int b)
    {
        if(b==0){
            System.out.println("Division by zero is not possible");
            return -1;
        }
        else{
        return a/b;
        }
    }
    public static boolean isEven(int n)
    {
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int findLargest(int a,int b)
    {
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;

        }
        else{
            System.out.println("Both are equal");
            return 1;
        }
    }
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter a second number: ");
        int b=sc.nextInt();
        System.out.println("Enter a number to perform even check and find factorial of it: ");
        int n=sc.nextInt();
        System.out.println("Addition: "+(Addition(a, b)));
        System.out.println("Subtraction: "+(Subtraction(a, b)));
        System.out.println("Multiplication: "+(Multiplication(a, b)));
        System.out.println("Division: "+(Division(a, b)));
        System.out.println("isEven: "+(isEven(n)));
        System.out.println("Largest Number: "+(findLargest(a, b)));
        System.out.println("Factorial: "+(factorial(n)));
        sc.close();
    }
    
}
