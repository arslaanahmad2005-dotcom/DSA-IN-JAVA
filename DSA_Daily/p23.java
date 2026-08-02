package DSA_Daily;
import java.util.*;;
public class p23 {
    public static void printAscending(int n)
    {
        if(n==0){
            return;
        }
        printAscending(n-1);
        System.out.print(n+" ");
    }
    public static void printDescending(int n)
    {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDescending(n-1);
    }
    public static int sum(int n)
    {
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range: ");
        int n=sc.nextInt();
        printAscending(n);
        System.out.println();
        printDescending(n);
        System.out.println();
        System.out.println("Sum of numbers to n: "+sum(n));
        sc.close();
    }
    
}
