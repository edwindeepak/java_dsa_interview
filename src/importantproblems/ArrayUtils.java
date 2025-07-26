package importantproblems;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {

    /**
     * Finds two numbers in an array that add up to a specific target.
     * Brute-force approach.
     *
     * @param nums The array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers, or null if not found.
     * Time Complexity: O(N^2)
     * Space Complexity: O(1)
     */
    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // No solution found
    }

    /**
     * Finds two numbers in an array that add up to a specific target.
     * Optimized approach using a HashMap.
     *
     * @param nums The array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers, or null if not found.
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Stores number -> index
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        return null; // No solution found
    }

    /**
     * Removes duplicates from a sorted array in-place.
     * The relative order of the unique elements should be kept the same.
     *
     * @param nums The sorted array with duplicates.
     * @return The number of unique elements (k). The first k elements
     * of nums contain the unique elements.
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int writeIndex = 0; // writeIndex points to the last unique element found
        // readIndex starts from 1 to compare with the element at writeIndex
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            // If the current element (at readIndex) is different from the last unique element (at writeIndex)
            if (nums[readIndex] != nums[writeIndex]) {
                writeIndex++; // Move writeIndex forward
                nums[writeIndex] = nums[readIndex]; // Place the new unique element at writeIndex
            }
        }
        // The number of unique elements is writeIndex + 1 (because writeIndex is 0-indexed)
        return writeIndex + 1; 
    }
    
    /**
     * Finds the single missing number in an array containing n-1 distinct numbers
     * taken from the range 1 to n.
     * This approach uses the arithmetic sum formula.
     *
     * @param nums The array of numbers with one missing.
     * @return The missing number.
     * Time Complexity: O(N) - It iterates through the array once.
     * Space Complexity: O(1) - It uses a constant amount of extra space.
     */
    public static int findMissingNumber(int[] nums) {
        // Step 1: Determine 'n' (the total count of numbers if none were missing).
        // If the array has 'nums.length' elements, and one number is missing from the 1 to n range,
        // then 'n' must be 'nums.length + 1'.
        int n = nums.length + 1;

        // Step 2: Calculate the expected sum of numbers from 1 to n.
        // The formula for the sum of the first 'n' natural numbers is n * (n + 1) / 2.
        // We cast 'n' to 'long' before multiplication to prevent potential integer overflow
        // for large values of 'n', ensuring the calculation is done using 'long' arithmetic.
        long expectedSum = (long)n * (n + 1) / 2;
        
        // Step 3: Calculate the actual sum of numbers present in the given array.
        // We use 'long' for 'actualSum' to match 'expectedSum' and to handle potentially large sums.
        long actualSum = 0;
        for(int x : nums) {
        	actualSum = actualSum + x;
        }
        
        // Step 4: The difference between the expected sum and the actual sum is the missing number.
        // The result (the missing number itself) will fit within the 'int' range.
        return (int) (expectedSum - actualSum);
    }
    
    /**
     * Finds the single missing number in an array containing n-1 distinct numbers
     * taken from the range 1 to n.
     * This approach uses the XOR bit manipulation property.
     *
     * @param nums The array of numbers with one missing.
     * @return The missing number.
     * Time Complexity: O(N) - It involves two passes through elements (one conceptual for 1 to n, one actual for array).
     * Space Complexity: O(1) - It uses a constant amount of extra space.
     */
    public static int findMissingNumberXOR(int[] nums) {
        // Step 1: Determine 'n' (the total count of numbers if none were missing).
        // Similar to the sum method, if 'nums' has length 'm', then n = m + 1.
        int n = nums.length + 1;

        // Step 2: Initialize a variable to hold the XOR sum.
        // Starting with 0 is ideal because A ^ 0 = A.
        int xorSum = 0;

        // Step 3: XOR xorSum with all numbers from 1 to n (the expected complete sequence).
        // This loop accumulates the XOR of all numbers that *should* be present.
        for(int i = 1; i <= n; i++) {
        	xorSum = i ^ xorSum;
        }

        // Step 4: XOR xorSum with all numbers present in the 'nums' array.
        // Each number 'x' present in 'nums' will cancel out its counterpart from the
        // expected sequence (because A ^ A = 0). The missing number will be the only
        // one without a pair to cancel it out.
        for(int x : nums) {
        	xorSum = x ^ xorSum;
        }

        // Step 5: The final value of xorSum will be the missing number,
        // as all common numbers have cancelled each other out (resulting in 0),
        // and 0 ^ MissingNumber = MissingNumber.
        return xorSum;
    }

    /**
     * Finds the second largest distinct element in an array of integers.
     *
     * @param nums The array of integers.
     * @return The second largest distinct element, or Integer.MIN_VALUE if not found
     * (e.g., array is null, empty, has only one element, or all elements are identical).
     * Time Complexity: O(N) - Single pass through the array.
     * Space Complexity: O(1) - Uses a constant amount of extra space.
     */
    public static int findSecondLargest(int[] nums) {
        // Handle edge cases: array is null, empty, or has only one element.
        // In these cases, a second largest distinct element cannot be found.
        if (nums == null || nums.length < 2) {
            return Integer.MIN_VALUE; // Sentinel value indicating not found
        }

        int max1 = Integer.MIN_VALUE; // Stores the largest element found so far
        int max2 = Integer.MIN_VALUE; // Stores the second largest distinct element found so far

        // Iterate through each number in the array
        for (int num : nums) {
            if (num > max1) {
                // If the current number is greater than the current largest (max1),
                // then the old max1 becomes the new second largest (max2),
                // and the current number becomes the new largest (max1).
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                // If the current number is not greater than max1 (i.e., it's less than or equal to max1),
                // but it IS greater than max2 AND it's distinct from max1,
                // then it's the new second largest (max2).
                max2 = num;
            }
            // If num == max1, we ignore it for max2 to ensure we find a *distinct* second largest.
            // If num < max2, we also ignore it as it's smaller than the current second largest.
        }

        // After iterating through all elements, if max2 is still Integer.MIN_VALUE,
        // it means no distinct second largest element was found. This happens if:
        // 1. All elements in the array were identical (e.g., [5, 5, 5]).
        // 2. The array contained only Integer.MIN_VALUE elements (e.g., [MIN_VALUE, MIN_VALUE]).
        // In such cases, we return Integer.MIN_VALUE as a clear indicator.
        if (max2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE; // Indicate no distinct second largest found
        }

        return max2; // Return the found second largest distinct element
    }
}
