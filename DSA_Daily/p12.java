package DSA_Daily;
import java.util.*;
public class p12 {
    public static int binarySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
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
        System.out.println("Enter target value to find");
        int target=sc.nextInt();
        System.out.println("Found at: "+binarySearch(arr, target));
        sc.close();
    
}
}
