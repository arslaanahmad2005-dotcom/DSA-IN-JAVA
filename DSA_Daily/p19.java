package DSA_Daily;


    public class p19 {

    // Check if Koko can finish all bananas within h hours
    public static boolean isPossible(int speed, int[] piles, int h) {
        int hours = 0;

        for (int pile : piles) {
            // Ceiling division
            hours += (pile + speed - 1) / speed;
        }

        return hours <= h;
    }

    // Find the minimum eating speed using Binary Search
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Bonus: Print every mid checked
            System.out.println("Checking mid = " + mid);

            if (isPossible(mid, piles, h)) {
                answer = mid;
                high = mid - 1; // Try a smaller speed
            } else {
                low = mid + 1; // Increase the speed
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);

        System.out.println("Minimum Eating Speed = " + result);
    }
}

