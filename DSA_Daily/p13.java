package DSA_Daily;
import java.util.*;
public class p13 {
    public static int firstOccurence(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                answer = mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;
    }
    public static int lastOccurence(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int answer=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                answer = mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
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

        System.out.println("Enter array elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value to find");
        int target=sc.nextInt();
        System.out.println("First Occurence: "+firstOccurence(arr, target));
        System.out.println("Last Occurence: "+lastOccurence(arr, target));
        System.out.println("Total no. of Occurences: "+((lastOccurence(arr, target)-firstOccurence(arr, target))+1));
        sc.close();
    }
    
}
