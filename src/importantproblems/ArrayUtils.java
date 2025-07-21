package importantproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet; // Needed for the commented-out Set approach
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;          // Needed for the commented-out Set approach

public class ArrayUtils {

    // Two Sum - Brute Force
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;  // no pair found
    }

    // Two Sum - Optimized using HashMap
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        return null;  // no pair found
    }

    // -----------------------------------------------
    // ✅ Remove Duplicates from Sorted Array (In-place)
    // -----------------------------------------------

    /*
     * Approach using Set (Commented Out):
     * - Conceptually identifies unique elements and preserves order (LinkedHashSet).
     * - NOT suitable for this problem's constraints:
     * 1. Not "in-place": Creates a new Set and potentially new array.
     * 2. Uses "extra space": O(N) space for the Set.
     */
    // public static int removeDuplicatesSetApproach(int[] nums) {
    //     Set<Integer> set = new LinkedHashSet<>();
    //     for (int x : nums) {
    //         set.add(x);
    //     }
    //     // To return 'k' (count of unique elements)
    //     return set.size();
    // }

    /**
     * Removes duplicates from a sorted array in-place, preserving relative order.
     *
     * @param nums The sorted array of integers. Modified directly.
     * @return The number of unique elements (k). The first k elements of nums
     * will contain the final unique sequence.
     * Time: O(N), Space: O(1).
     */
    public static int removeDuplicates(int[] nums) {
        // Handle empty array case.
        if (nums.length == 0) {
            return 0;
        }

        // 'writeIndex': Pointer for the position where the next unique element should be written.
        // Also tracks the last index of the unique elements found so far.
        int writeIndex = 0;

        // 'readIndex': Pointer that iterates through the entire array.
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            // If the element at 'readIndex' is different from the last unique element recorded by 'writeIndex',
            // it means we found a new unique element.
            if (nums[readIndex] != nums[writeIndex]) {
                // Move 'writeIndex' to the next available slot for a unique element.
                writeIndex++;
                // Copy the new unique element from 'readIndex' to 'writeIndex's position.
                nums[writeIndex] = nums[readIndex];
            }
            // If nums[readIndex] == nums[writeIndex], it's a duplicate.
            // 'readIndex' moves on in the loop, effectively skipping the duplicate.
        }

        // 'writeIndex' is the last index of the unique elements (0-based).
        // So, the count 'k' is 'writeIndex + 1'.
        return writeIndex + 1;
    }
}