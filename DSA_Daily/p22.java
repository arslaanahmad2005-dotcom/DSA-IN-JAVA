package DSA_Daily;
import java.util.*;

public class p22 {

    // Check if allocation is possible
    public static boolean isPossible(int[] books, int maxPages, int students) {

        int studentCount = 1;
        int pages = 0;

        for (int book : books) {

            if (book > maxPages) {
                return false;
            }

            if (pages + book <= maxPages) {
                pages += book;
            } else {
                studentCount++;
                pages = book;

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }

    // Binary Search
    public static int allocateBooks(int[] books, int students) {

        if (students > books.length)
            return -1;

        int low = 0;
        int high = 0;

        for (int book : books) {
            low = Math.max(low, book);
            high += book;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Bonus Challenge
            System.out.println("Checking mid = " + mid);

            if (isPossible(books, mid, students)) {
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

        int n = sc.nextInt();

        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        int students = sc.nextInt();

        int result = allocateBooks(books, students);

        if (result == -1)
            System.out.println("Allocation not possible");
        else
            System.out.println("Minimum possible maximum pages = " + result);

        sc.close();
    }
}