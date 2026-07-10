package DSA_Daily;
import java.util.*;
/**
 * p1
 */
public class p1 {
    public static int calcSum(int a,int b)
    {
       int sum=a+b;
       return sum;
    }
    public static int calcProd(int a,int b)
    {
        int prod=a*b;
        return prod;
    }
    public static int findMax(int a,int b)
    {
        int max=Math.max(a, b);
        return max;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int x=sc.nextInt();
    System.out.println("Enter second number: ");
    int y=sc.nextInt();
    int sum=calcSum(x,y);
    int prod=calcProd(x,y);
    int max=findMax(x,y);
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + prod);
    System.out.println("Maximum: " + max);
    sc.close();  
    }
}
