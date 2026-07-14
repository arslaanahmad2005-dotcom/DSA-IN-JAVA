package DSA_Daily;
import java.util.*;
/**
 * p5
 */
public class p5 {
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        
        }
        return max;
    }
    public static int findMin(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        
        }
        return min;
    }
    public static int countEven(int arr[]){
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0){
            x=x+1;
          }
        }
        return x;
    }
    public static int countOdd(int arr[]){
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2!=0){
            x=x+1;
          }
        }
        return x;
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
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int sum=0;
        for (int value : arr) {
            sum=sum+value;
            
        }
        float average=sum/n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        int max=findMax(arr);
        int min=findMin(arr);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Even Count: "+countEven(arr));
        System.out.println("Odd Count: "+countOdd(arr));
        System.out.println("Array in reverse order\n");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+ " ");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not present in non decreasing order");
                break;

            }
            else{
                System.out.println("In non decreasing order till now");
            }

        }
        
        

        sc.close();
    }

    
}