package DSA_Daily;
import java.util.Scanner;

public class p20 {

    // Checks if it is possible to ship all packages within given days
    public static boolean isPossible(int[] weights, int capacity, int days) {
        int requiredDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            // A single package is heavier than capacity
            if (weight > capacity) {
                return false;
            }

            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } else {
                requiredDays++;
                currentLoad = weight;
            }
        }

        return requiredDays <= days;
    }

    // Finds the minimum ship capacity using Binary Search
    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Search range
        for (int weight : weights) {
            low = Math.max(low, weight); // Minimum possible capacity
            high += weight;              // Maximum possible capacity
        }

        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Bonus: Print every capacity checked
            System.out.println("Checking Capacity: " + mid);

            if (isPossible(weights, mid, days)) {
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

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum Ship Capacity = " + result);

        sc.close();
    }
}