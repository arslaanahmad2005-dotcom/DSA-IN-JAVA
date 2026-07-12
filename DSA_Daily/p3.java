package DSA_Daily;
import java.util.*;
/**
 * p3
 */
public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a range of numbers: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            sum+=i;
        }
        int m=n;
        while(m!=0){
            System.out.println(m);
            m--;
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Even numbers: ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers: ");
        
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=i){
                    System.out.print("*");
                }
                

            }
            System.out.println();
            
        }
        System.out.println("The multiplication table of: "+n);
        for(int i=1;i<=10;i++){
             System.out.println(n+" * "+i+" = "+(n*i));
        }
        sc.close();

    }

    
}