// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Example 2:

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.
// Example 3:

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.
 

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
class Solution {
    public int thirdMax(int[] nums) {
        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Ignore duplicates
            if (nums[i] == first_max || 
                nums[i] == second_max || 
                nums[i] == third_max) {
                continue;
            }

            if (nums[i] > first_max) {
                third_max = second_max;
                second_max = first_max;
                first_max = nums[i];
            }
            else if (nums[i] > second_max) {
                third_max = second_max;
                second_max = nums[i];
            }
            else if (nums[i] > third_max) {
                third_max = nums[i];
            }
        }

        // If third distinct maximum doesn't exist
        if (third_max == Long.MIN_VALUE) {
            return (int) first_max;
        }

        return (int) third_max;
    }
}