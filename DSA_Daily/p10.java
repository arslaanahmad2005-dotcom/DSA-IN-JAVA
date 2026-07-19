package DSA_Daily;

import java.util.*;

public class p10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print frequency
        System.out.println("\nElement : Frequency");
        for (int key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // Find most and least frequent element
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = 0;
        int minElement = 0;

        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }

            if (map.get(key) < minFreq) {
                minFreq = map.get(key);
                minElement = key;
            }
        }

        System.out.println("\nMost Frequent Element: " + maxElement);
        System.out.println("Least Frequent Element: " + minElement);

        // Elements appearing exactly once
        System.out.println("\nElements appearing exactly once:");
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }

        // Duplicate elements
        System.out.println("\n\nDuplicate Elements:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        sc.close();
    }
}