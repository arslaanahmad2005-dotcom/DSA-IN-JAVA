package DSA_Daily;
import java.util.*;
public class p14 {
    public static int searchInsert(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Target element already found at index: "+mid);
                return -1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Insert Position will be: "+low);
        return low;
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
        System.out.println("Enter target value to insert");
        int target=sc.nextInt();
        int pos=searchInsert(arr, target);
        int newarr[]=new int[arr.length+1];
        newarr[pos]=target;
        if(pos!=-1){
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        for(int j=pos;j<newarr.length;j++){
            if(j+1<newarr.length)
            newarr[j+1]=arr[j];
        }
    }
        if(pos!=-1){
        System.out.println("Array after insertion: ");
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]+" ");
        }
    }
        sc.close();
    }
    
}
