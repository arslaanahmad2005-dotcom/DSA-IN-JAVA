package DSA_Daily;
import java.util.*;
public class p15 {
    public static int lowerBound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int answer=arr.length;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]>=target){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
    }
    public static int upperBound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int answer=arr.length;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]>target){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
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
        System.out.println("Upper Bound: "+upperBound(arr, target));
        System.out.println("Lower Bound: "+lowerBound(arr, target));
        System.out.println("Number of Occurences= "+(upperBound(arr, target)-lowerBound(arr, target)));
        sc.close();
    }
    
}
