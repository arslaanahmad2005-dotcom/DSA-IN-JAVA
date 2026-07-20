package DSA_Daily;

import java.util.*;

public class p11 {
    public static int[] prefixSum(int arr[],int start,int end){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        int left=start;
        int right=end;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int sum=prefix[right]-prefix[left-1];
        System.out.println("Range Sum: "+sum);
        return prefix;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter start index for printing sum:");
        int start=sc.nextInt();
        System.out.println("Enter ending index for printing sum:");

        int end=sc.nextInt();
        System.out.println("Prefix Sum Array: ");
        int prefix[]=prefixSum(arr,start,end);
        for(int i=0;i<prefix.length;i++){
            System.out.println(prefix[i]+" ");

        }

        sc.close();
}
}
