package importantproblems;

import java.util.*; 

public class ArrayUtils {

    // ================================
    // ✅ 1. Two Sum
    // ================================

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    // ================================
    // ✅ 2. Remove Duplicates from Sorted Array
    // ================================
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int writeIndex = 0;
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != nums[writeIndex]) {
                writeIndex++;
                nums[writeIndex] = nums[readIndex];
            }
        }
        return writeIndex + 1;
    }

    // ================================
    // ✅ 3. Find Missing Number (Arithmetic Sum + XOR)
    // ================================
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int x : nums) actualSum += x;
        return (int) (expectedSum - actualSum);
    }

    public static int findMissingNumberXOR(int[] nums) {
        int n = nums.length + 1;
        int xorSum = 0;

        for (int i = 1; i <= n; i++) xorSum ^= i;
        for (int x : nums) xorSum ^= x;

        return xorSum;
    }

    // ================================
    // ✅ 4. Second Largest
    // ================================
    public static int findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) return Integer.MIN_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2;
    }

    // ================================
    // ✅ 5. Largest and Smallest
    // ================================

    // Simple scan
    public static int[] largestAndSmallestSimple(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};

        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) largest = nums[i];
            if (nums[i] < smallest) smallest = nums[i];
        }
        return new int[]{largest, smallest};
    }

    // Tournament method
    public static int[] largestAndSmallestOptimized(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};

        int largest, smallest;
        int i;

        if (nums.length % 2 == 0) {
            if (nums[0] > nums[1]) {
                largest = nums[0];
                smallest = nums[1];
            } else {
                largest = nums[1];
                smallest = nums[0];
            }
            i = 2;
        } else {
            largest = smallest = nums[0];
            i = 1;
        }

        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                if (nums[i] > largest) largest = nums[i];
                if (nums[i + 1] < smallest) smallest = nums[i + 1];
            } else {
                if (nums[i + 1] > largest) largest = nums[i + 1];
                if (nums[i] < smallest) smallest = nums[i];
            }
            i += 2;
        }
        return new int[]{largest, smallest};
    }

    // ================================
    // ✅ 6. Intersection of Two Arrays
    // ================================

    /**
     * Variation 1: Unique Intersection
     * - Uses HashSet
     * - Output: distinct common elements
     * - Example: nums1=[1,2,2,3], nums2=[2,2,4] → [2]
     */
    public static int[] intersectionUnique(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) set1.add(x);

        Set<Integer> resultSet = new HashSet<>();
        for (int x : nums2) {
            if (set1.contains(x)) resultSet.add(x);
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int x : resultSet) result[i++] = x;
        return result;
    }

    /**
     * Variation 2: Intersection With Duplicates
     * - Uses HashMap to track frequencies
     * - Output: common elements considering counts
     * - Example: nums1=[1,2,2,3], nums2=[2,2,4] → [2,2]
     */
    public static int[] intersectionWithDuplicates(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : nums2) {
            if (map.containsKey(x) && map.get(x) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Variation 3: Intersection With Duplicates (Two Pointer Method)
     * - Requires both arrays to be sorted
     * - Example: nums1=[1,2,2,3], nums2=[2,2,4] → [2,2]
     */
    public static int[] intersectionTwoPointers(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
