//Finding minimum element in rotated sorted array
package DSA_Daily;
import java.util.*;
public class p17 {
   public static int findMin(int[] arr){

    int low = 0;
    int high = arr.length - 1;
    int answer=Integer.MAX_VALUE;

    while(low <= high){

        if(arr[low]<=arr[high]){
            answer= Math.min(answer,arr[low]);
            break;
        }
        int mid = low + (high - low) / 2;
        // Left half is sorted
        if(arr[low] <= arr[mid]){

            answer=Math.min(answer,arr[low]);
            low=mid+1;

        }
        else{
            answer=Math.min(answer,arr[mid]);
            high=mid-1;
           

        }

    }

    return answer;

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
        System.out.println("Minimum Element is: "+findMin(arr));
        sc.close();
    }
    
}
