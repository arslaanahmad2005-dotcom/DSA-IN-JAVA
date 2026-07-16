package DSA_Daily;
import java.util.*;
public class p7 {

    public static int[] reverseArray(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void indexbasedReverse(int arr[],int start,int end){
        int left=start;
        int right=end;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array in given range:");
        for (int value : arr) {
        System.out.print(value+" ");
        
    }
        
    }
    public static void checkPalindrome(int arr2[]){
        int arr3[]=new int[arr2.length];
        int c=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr3[i]=arr2[i];
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==arr3[i]){
                c=c+1;

            }
        }
        if(c==arr2.length){
            System.out.println("Array is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int arr2[]= new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        reverseArray(arr);
        System.out.print("Reversed Array:\n" +Arrays.toString(arr));
        System.out.println("\n");
        System.out.println("Enter start index for array reverse: ");
        int start=sc.nextInt();
        System.out.println("Enter ending index for array reverse: ");
        int end=sc.nextInt();
        indexbasedReverse(arr2, start, end);
        System.out.println("\n");
        checkPalindrome(arr2);
        sc.close();
    }
    
}
