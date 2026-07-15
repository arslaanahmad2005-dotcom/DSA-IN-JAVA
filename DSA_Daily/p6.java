package DSA_Daily;

/**
 * p6
 */
import java.util.*;
public class p6 {
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: ");
                return i;
            }
            
            
        }
        System.out.println("Element Not found");
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element to find: ");
        int target=sc.nextInt();
        System.out.println(linearSearch(arr, target));
        sc.close();
    }

    
}