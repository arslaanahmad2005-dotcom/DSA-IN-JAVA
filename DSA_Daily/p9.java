package DSA_Daily;

public class p9 {

    // Find largest element
    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    // Find second largest distinct element
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 40, 30};

        int largest = findLargest(arr);
        int secondLargest = findSecondLargest(arr);

        System.out.println("Largest = " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element");
        }
        else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}