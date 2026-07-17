package DSA_Daily;
import java.util.*;
public class p8 {
    public static void findMaxMin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        int second_largest=max-1;
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr.length==0){
                System.out.println("Array has no elements");
                return;
            }
            else{
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                c+=1;
            }
            
        }
        int i=0;
        while (i!=arr.length) {
            if(second_largest<arr[i] && arr[i]<max){
               second_largest=arr[i];
            }
            i=i+1;
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
        System.out.println("Difference between max and min value: "+(max-min));
        System.out.println("Maximum element count: "+c);
        System.out.println("Second largest Element of Array: "+second_largest);
        return;
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
        findMaxMin(arr);
        sc.close();
    }
    
}
