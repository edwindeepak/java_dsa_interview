package importantproblems;

import java.util.Arrays;
import java.util.Map; // Needed for StringUtils.charFrequencies if uncommented

public class MainTest { // Class name is MainTest as per your original request

    public static void main(String[] args) {

        System.out.println("--- Starting All Problem Tests ---");

        // ================================
        // ✅ Two Sum (Array)
        // ================================
        System.out.println("\n===== Two Sum =====");
        int[] numsTwoSum = {2, 7, 11, 15};
        int targetTwoSum = 9;
        System.out.println("Input Array: " + Arrays.toString(numsTwoSum) + ", Target: " + format(ArrayUtils.twoSumBrute(numsTwoSum, targetTwoSum)));
        System.out.println("Two Sum (Optimized): " + format(ArrayUtils.twoSumOptimized(numsTwoSum, targetTwoSum)));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Longest Substring (Sliding Window)
        // ================================
        System.out.println("\n===== Longest Substring Without Repeating Characters =====");
        String inputLS = "edwindeepak";
        System.out.println("Input String: \"" + inputLS + "\"");
        // Assuming SlidingWindowUtils.java exists in the same package
        System.out.println("Longest Substring (Brute): " + SlidingWindowUtils.longestSubstringBrute(inputLS));
        System.out.println("Longest Substring (Optimized): " + SlidingWindowUtils.longestSubstringOptimized(inputLS));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ String Reversal
        // ================================
        System.out.println("\n===== String Reversal =====");
        String strRev = "This is a wonderful day!";
        System.out.println("Original String: \"" + strRev + "\"");
        // Assuming StringUtils.java exists in the same package
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
        // Assuming StringUtils.java exists in the same package
        System.out.println("Each Word Reversed: " + StringUtils.reverseEachWord(sentenceRev));
        System.out.println("Words Reversed Order: " + StringUtils.reverseWordOrder(sentenceRev));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ String Palindrome Check
        // ================================
        System.out.println("\n===== String Palindrome Check =====");
        String pal1 = "A man, a plan, a canal: Panama";
        String pal2 = "This is not a palindrome";
        // Assuming StringUtils.java exists in the same package
        System.out.println("\"" + pal1 + "\" → Palindrome? " + StringUtils.isPalindrome(pal1));
        System.out.println("\"" + pal2 + "\" → Palindrome? " + StringUtils.isPalindrome(pal2));
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Number Palindrome Check
        // ================================
        System.out.println("\n===== Number Palindrome Check =====");
        int num1 = 121;
        int num2 = 12321;
        int num3 = -121;
        int num4 = 1234;
        // Assuming Misc.java exists in the same package
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
            // Assuming StringUtils.java exists in the same package
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
            // Assuming StringUtils.java exists in the same package
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
            // Assuming StringUtils.java exists in the same package
            char result = StringUtils.firstNonRepeatingChar(testStr);
            System.out.println("First non-repeating in \"" + testStr + "\": '" + 
                               (result == '\0' ? "Not found" : result) + "'");
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Remove Duplicates from Sorted Array (In-place)
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
            // Create a copy because removeDuplicates modifies the array in-place
            int[] arrCopy = Arrays.copyOf(arr, arr.length); 
            System.out.println("Original: " + Arrays.toString(arr) + " -> k = " + ArrayUtils.removeDuplicates(arrCopy) + 
                               ", Modified Array: " + Arrays.toString(Arrays.copyOf(arrCopy, ArrayUtils.removeDuplicates(arrCopy))));
        }
        System.out.println("--------------------------------------------------");

        // ================================
        // ✅ Remove Duplicates from String
        // ================================
        System.out.println("\n===== Remove Duplicates from String =====");
        String dupStr = "programming";
        // Assuming StringUtils.java exists in the same package
        System.out.println("Remove duplicates from \"" + dupStr + "\": " + StringUtils.removeDupsString(dupStr));
        System.out.println("--------------------------------------------------");

        // =================================================================================================
        // ✅ Find Missing Number in Array (Arithmetic Sum and XOR Methods)
        // =================================================================================================
        System.out.println("\n===== Find Missing Number in Array =====");

        System.out.println("\n--- Arithmetic Sum Method ---");
        int[][] missingTestArrays = {
            {3, 1, 4},   // n=4, range 1..4, missing 2
            {1, 2, 4, 5},// n=5, range 1..5, missing 3
            {1},         // n=2, range 1..2, missing 2
            {}           // n=1, range 1..1, missing 1 (edge case for empty array)
        };

        for (int[] arr : missingTestArrays) {
            System.out.println("Array: " + Arrays.toString(arr) + 
                               ", Missing: " + ArrayUtils.findMissingNumber(arr));
        }

        System.out.println("\n--- XOR Bit Manipulation Method ---");
        for (int[] arr : missingTestArrays) { // Using the same test cases
            System.out.println("Array: " + Arrays.toString(arr) + 
                               ", Missing: " + ArrayUtils.findMissingNumberXOR(arr));
        }
        System.out.println("--------------------------------------------------");

        // =================================================================================================
        // ✅ Second Largest Number in Array - NEWLY ADDED TEST CASES
        // =================================================================================================
        System.out.println("\n===== Find Second Largest Number in Array =====");

        int[][] secondLargestTestArrays = {
            {10, 5, 20, 8, 15},     // Standard case: 20 is largest, 15 is second largest
            {5, 5, 5, 5},           // All same elements: no distinct second largest
            {10, 20, 30},           // Ascending: 30 largest, 20 second largest
            {30, 20, 10},           // Descending: 30 largest, 20 second largest
            {7},                    // Single element: no second largest
            {},                     // Empty array: no second largest
            {-5, -1, -10, -2},      // Negative numbers: -1 largest, -2 second largest
            {1, 2, 3, 2, 1},        // Duplicates: 3 largest, 2 second largest
            {Integer.MAX_VALUE, 100, Integer.MIN_VALUE, 50} // Edge with min/max values
        };

        for (int[] arr : secondLargestTestArrays) {
            int secondLargest = ArrayUtils.findSecondLargest(arr);
            
            // Custom message for clarity on edge cases where no distinct second largest is found
            String resultStr;
            // The condition `arr == null || arr.length < 2` is already handled by findSecondLargest
            // returning Integer.MIN_VALUE. We just need to check if it returned MIN_VALUE and
            // if all elements were indeed the same (to differentiate from MIN_VALUE being a valid second largest).
            if (secondLargest == Integer.MIN_VALUE && (arr.length == 0 || arr.length == 1 || allElementsSame(arr))) {
                resultStr = "Not found (array too small or all elements identical)";
            } else {
                resultStr = String.valueOf(secondLargest);
            }
            
            System.out.println("Array: " + Arrays.toString(arr) + 
                               ", Second Largest: " + resultStr);
        }
        System.out.println("--------------------------------------------------");

        System.out.println("\n--- All Tests Completed ---");
    }

    // Helper method to format Two Sum output
    private static String format(int[] result) {
        return (result != null && result.length == 2) ? Arrays.toString(result) : "No result found";
    }

    // Helper method to check if all elements in an array are the same
    // Used for providing more descriptive output in test cases.
    private static boolean allElementsSame(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true; // An empty or single-element array technically has all elements "the same"
        }
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != first) {
                return false;
            }
        }
        return true;
    }
}
