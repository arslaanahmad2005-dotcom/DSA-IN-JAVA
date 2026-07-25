package DSA_Daily;
import java.util.*;
public class p16 {
   public static int search(int[] arr, int target){

    int low = 0;
    int high = arr.length - 1;

    while(low <= high){

        int mid = low + (high - low) / 2;

        if(arr[mid] == target){
            return mid;
        }

        // Left half is sorted
        if(arr[low] <= arr[mid]){

            if(target >= arr[low] && target < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        // Right half is sorted
        else{

            if(target > arr[mid] && target <= arr[high]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

    }

    return -1;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value to check");
        int target=sc.nextInt();
        int answer=search(arr, target);
        if(answer!=-1){
            System.out.println("Found at index: "+answer);
        }
        else{
            System.out.println("Not found");
        }
        sc.close();
    }
    
}
