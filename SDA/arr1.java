package SDA;
//finding max and min value
import java.util.*;
public class arr1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int max;
        int min;
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Largest Number is :" +max);
        System.out.println("Smallest Number is :" +min);


    }

}
