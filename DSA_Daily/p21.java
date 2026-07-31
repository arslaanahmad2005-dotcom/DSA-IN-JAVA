package DSA_Daily;
import java.util.Scanner;

public class p21 {

    // Check if it is possible to split into at most k subarrays
    // such that no subarray sum exceeds maxSum
    public static boolean isPossible(int[] nums, int maxSum, int k) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                count++;
                currentSum = num;

                if (count > k) {
                    return false;
                }
            }
        }

        return true;
    }

    // Binary Search for minimum possible largest subarray sum
    public static int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Bonus: Print current mid
            System.out.println("Checking mid = " + mid);

            if (isPossible(nums, mid, k)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = splitArray(nums, k);

        System.out.println("Minimum Possible Largest Subarray Sum = " + result);

        sc.close();
    }
}