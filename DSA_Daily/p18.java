//Finding minimum element in rotated sorted array
package DSA_Daily;
import java.util.*;
public class p18 {
   public static int findPeakElement(int[] arr){

    int low = 0;
    int high = arr.length - 1;
    

    while(low < high){
        int mid = low + (high - low) / 2;
        if(arr[mid] < arr[mid+1]){
            low=mid+1;

        }
        else{
            high=mid;
           

        }

    }

    return low;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements in rotated sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Peak Element is: "+findPeakElement(arr));
        sc.close();
    }
    
}
