package importantproblems;

import java.util.*;

public class MainTest {

    public static void main(String[] args) {

        System.out.println("--- Starting All Problem Tests ---");

        // ================================
        // ✅ Two Sum (Array)
        // ================================
        System.out.println("\n===== Two Sum =====");
        int[] numsTwoSum = {2, 7, 11, 15};
        int targetTwoSum = 9;
        System.out.println("Input Array: " + Arrays.toString(numsTwoSum) + ", Target: " + targetTwoSum);
        System.out.println("Two Sum (Brute): " + format(ArrayUtils.twoSumBrute(numsTwoSum, targetTwoSum)));
        System.out.println("Two Sum (Optimized): " + format(ArrayUtils.twoSumOptimized(numsTwoSum, targetTwoSum)));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Longest Substring (Sliding Window)
        // ================================
        System.out.println("\n===== Longest Substring Without Repeating Characters =====");
        String inputLS = "edwindeepak";
        System.out.println("Input String: \"" + inputLS + "\"");
        System.out.println("Longest Substring (Brute): " + SlidingWindowUtils.longestSubstringBrute(inputLS));
        System.out.println("Longest Substring (Optimized): " + SlidingWindowUtils.longestSubstringOptimized(inputLS));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ String Reversal
        // ================================
        System.out.println("\n===== String Reversal =====");
        String strRev = "This is a wonderful day!";
        System.out.println("Original String: \"" + strRev + "\"");
        System.out.println("Reversed (Brute): " + StringUtils.reverseBrute(strRev));
        System.out.println("Reversed (Two Pointer): " + StringUtils.reverseTwoPointer(strRev));
        System.out.println("Reversed (InBuilt): " + StringUtils.reverseInBuilt(strRev));
        System.out.println("Reversed (No Spaces): " + StringUtils.reverseNoSpaces(strRev));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Word Reversal Variations
        // ================================
        System.out.println("\n===== Word Reversal Variations =====");
        String sentenceRev = "Hello world this is Java";
        System.out.println("Original Sentence: \"" + sentenceRev + "\"");
        System.out.println("Each Word Reversed: " + StringUtils.reverseEachWord(sentenceRev));
        System.out.println("Words Reversed Order: " + StringUtils.reverseWordOrder(sentenceRev));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ String Palindrome Check
        // ================================
        System.out.println("\n===== String Palindrome Check =====");
        String pal1 = "A man, a plan, a canal: Panama";
        String pal2 = "This is not a palindrome";
        System.out.println("\"" + pal1 + "\" → Palindrome? " + StringUtils.isPalindrome(pal1));
        System.out.println("\"" + pal2 + "\" → Palindrome? " + StringUtils.isPalindrome(pal2));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Number Palindrome Check
        // ================================
        System.out.println("\n===== Number Palindrome Check =====");
        int num1 = 121, num2 = 12321, num3 = -121, num4 = 1234;
        System.out.println("Is " + num1 + " Palindrome (String)? → " + Misc.isNumberPalindromeString(num1));
        System.out.println("Is " + num4 + " Palindrome (String)? → " + Misc.isNumberPalindromeString(num4));
        System.out.println("Is " + num2 + " Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num2));
        System.out.println("Is " + num3 + " Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num3));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Anagram Check
        // ================================
        System.out.println("\n===== Anagram Check =====");
        String[][] anagramPairs = {
            {"listen", "silent"},
            {"hello", "world"},
            {"aab", "aba"},
            {"apple", "pale"},
            {"danger", "garden"}
        };
        for (String[] pair : anagramPairs) {
            System.out.println("Are \"" + pair[0] + "\" and \"" + pair[1] + "\" anagrams? → " +
                               StringUtils.anagramcheck(pair[0], pair[1]));
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Count Character Frequencies
        // ================================
        System.out.println("\n===== Count Character Frequencies =====");
        String[] freqTestStrings = {"hello", "Programming", "zzzaaab", ""};
        for (String testStr : freqTestStrings) {
            Map<Character, Integer> frequencies = StringUtils.charFrequencies(testStr);
            System.out.println("Frequencies for \"" + testStr + "\": " + frequencies);
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ First Non-Repeating Character
        // ================================
        System.out.println("\n===== First Non-Repeating Character =====");
        String[] nonRepTestStrings = {"leetcode", "loveleetcode", "aabbcc", "Programming", "i am edy"};
        for (String testStr : nonRepTestStrings) {
            char result = StringUtils.firstNonRepeatingChar(testStr);
            System.out.println("First non-repeating in \"" + testStr + "\": '" +
                               (result == '\0' ? "Not found" : result) + "'");
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Remove Duplicates from Sorted Array
        // ================================
        System.out.println("\n===== Remove Duplicates from Sorted Array (In-place) =====");
        int[][] dupTestArrays = {
            {1, 1, 2},
            {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
            {1, 2, 2, 3, 4, 5, 5, 5, 6, 8, 9, 9},
            {},
            {7}
        };
        for (int[] arr : dupTestArrays) {
            int[] arrCopy = Arrays.copyOf(arr, arr.length);
            int k = ArrayUtils.removeDuplicates(arrCopy);
            System.out.println("Original: " + Arrays.toString(arr) +
                               " -> k = " + k +
                               ", Modified Array: " + Arrays.toString(Arrays.copyOf(arrCopy, k)));
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Remove Duplicates from String
        // ================================
        System.out.println("\n===== Remove Duplicates from String =====");
        String dupStr = "programming";
        System.out.println("Remove duplicates from \"" + dupStr + "\": " + StringUtils.removeDupsString(dupStr));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Find Missing Number
        // ================================
        System.out.println("\n===== Find Missing Number in Array =====");
        int[][] missingTestArrays = {
            {3, 1, 4},
            {1, 2, 4, 5},
            {1},
            {}
        };
        System.out.println("\n--- Arithmetic Sum Method ---");
        for (int[] arr : missingTestArrays) {
            System.out.println("Array: " + Arrays.toString(arr) +
                               ", Missing: " + ArrayUtils.findMissingNumber(arr));
        }
        System.out.println("\n--- XOR Bit Manipulation Method ---");
        for (int[] arr : missingTestArrays) {
            System.out.println("Array: " + Arrays.toString(arr) +
                               ", Missing: " + ArrayUtils.findMissingNumberXOR(arr));
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Second Largest
        // ================================
        System.out.println("\n===== Find Second Largest Number in Array =====");
        int[][] secondLargestTestArrays = {
            {10, 5, 20, 8, 15},
            {5, 5, 5, 5},
            {10, 20, 30},
            {30, 20, 10},
            {7},
            {},
            {-5, -1, -10, -2},
            {1, 2, 3, 2, 1},
            {Integer.MAX_VALUE, 100, Integer.MIN_VALUE, 50}
        };
        for (int[] arr : secondLargestTestArrays) {
            int secondLargest = ArrayUtils.findSecondLargest(arr);
            String resultStr;
            if (secondLargest == Integer.MIN_VALUE && (arr.length == 0 || arr.length == 1 || allElementsSame(arr))) {
                resultStr = "Not found (array too small or all elements identical)";
            } else {
                resultStr = String.valueOf(secondLargest);
            }
            System.out.println("Array: " + Arrays.toString(arr) + ", Second Largest: " + resultStr);
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Largest & Smallest
        // ================================
        System.out.println("\n===== Largest and Smallest in Array =====");
        int[][] minMaxTestArrays = {
            {3, 1, 4, 1, 5, 9},
            {10},
            {-10, -20, -30, -5},
            {100, 200, 50, 25, 300},
            {}
        };
        for (int[] arr : minMaxTestArrays) {
            int[] simple = ArrayUtils.largestAndSmallestSimple(arr);
            int[] optimized = ArrayUtils.largestAndSmallestOptimized(arr);
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("  Simple → " + formatMinMax(simple));
            System.out.println("  Optimized → " + formatMinMax(optimized));
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Intersection of Two Arrays
        // ================================
        System.out.println("\n===== Intersection of Two Arrays =====");

        /*
         * Test Case Summary:
         * nums1 = [1,2,2,1], nums2 = [2,2]
         *   Unique → [2]
         *   With Duplicates → [2,2]
         *
         * nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         *   Unique → [4,9]
         *   With Duplicates → [4,9]
         *
         * nums1 = [2,2,2,3,4,5,5,6], nums2 = [2,2,3,3,4,5,6,6]
         *   Unique → [2,3,4,5,6]
         *   With Duplicates → [2,2,3,4,5,6]
         */
        int[][] nums1Test = {
            {1, 2, 2, 1},
            {4, 9, 5},
            {2, 2, 2, 3, 4, 5, 5, 6}
        };
        int[][] nums2Test = {
            {2, 2},
            {9, 4, 9, 8, 4},
            {2, 2, 3, 3, 4, 5, 6, 6}
        };
        for (int t = 0; t < nums1Test.length; t++) {
            int[] nums1 = nums1Test[t];
            int[] nums2 = nums2Test[t];
            System.out.println("\nnums1 = " + Arrays.toString(nums1) + ", nums2 = " + Arrays.toString(nums2));
            System.out.println("Unique Intersection → " + Arrays.toString(ArrayUtils.intersectionUnique(nums1, nums2)));
            System.out.println("With Duplicates (Map) → " + Arrays.toString(ArrayUtils.intersectionWithDuplicates(nums1, nums2)));
            System.out.println("With Duplicates (Two Pointers) → " + Arrays.toString(ArrayUtils.intersectionTwoPointers(nums1, nums2)));
        }
        System.out.println("--------------------------------------------------");

        System.out.println("\n--- All Tests Completed ---");
    }

    // Helpers
    private static String format(int[] result) {
        return (result != null && result.length > 0) ? Arrays.toString(result) : "No result found";
    }

    private static String formatMinMax(int[] result) {
        if (result == null || result.length < 2) {
            return "Array is empty or invalid";
        }
        return "Largest = " + result[0] + ", Smallest = " + result[1];
    }

    private static boolean allElementsSame(int[] arr) {
        if (arr == null || arr.length <= 1) return true;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != first) return false;
        }
        return true;
    }
}
