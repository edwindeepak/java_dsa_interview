package importantproblems;

import java.util.Arrays;
import java.util.Map; // Don't forget this import for handling Map objects

// Assuming ArrayUtils, SlidingWindowUtils, Misc classes exist in the same package

public class MainTest {
    public static void main(String[] args) {

        // ================================
        // ✅ Two Sum (Array)
        // ================================
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum (Brute): " + format(ArrayUtils.twoSumBrute(nums, target)));
        System.out.println("Two Sum (Optimized): " + format(ArrayUtils.twoSumOptimized(nums, target)));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Longest Substring (Sliding Window)
        // ================================
        String input = "edwindeepak";
        System.out.println("Longest Substring (Brute): " + SlidingWindowUtils.longestSubstringBrute(input));
        System.out.println("Longest Substring (Optimized): " + SlidingWindowUtils.longestSubstringOptimized(input));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ String Reversal
        // ================================
        String str = "This is a wonderful day!";
        System.out.println("Reversed (Brute): " + StringUtils.reverseBrute(str));
        System.out.println("Reversed (Two Pointer): " + StringUtils.reverseTwoPointer(str));
        System.out.println("Reversed (InBuilt): " + StringUtils.reverseInBuilt(str));
        System.out.println("Reversed (No Spaces): " + StringUtils.reverseNoSpaces(str));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Word Reversal Variations
        // ================================
        String sentence = "Hello world this is Java";
        System.out.println("Each Word Reversed: " + StringUtils.reverseEachWord(sentence));
        System.out.println("Words Reversed Order: " + StringUtils.reverseWordOrder(sentence));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ String Palindrome Check
        // ================================
        String pal1 = "A man, a plan, a canal: Panama";
        String pal2 = "This is not a palindrome";
        System.out.println("\"" + pal1 + "\" → Palindrome? " + StringUtils.isPalindrome(pal1));
        System.out.println("\"" + pal2 + "\" → Palindrome? " + StringUtils.isPalindrome(pal2));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Number Palindrome Check
        // ================================
        int num1 = 121;
        int num2 = 12321;
        int num3 = -121;
        int num4 = 1234;

        System.out.println("Is " + num1 + " Palindrome (String)? → " + Misc.isNumberPalindromeString(num1));
        System.out.println("Is " + num4 + " Palindrome (String)? → " + Misc.isNumberPalindromeString(num4));
        System.out.println("Is " + num2 + " Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num2));
        System.out.println("Is " + num3 + " Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num3));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Anagram Check
        // ================================
        String anagram1_s1 = "listen";
        String anagram1_s2 = "silent";
        String anagram2_s1 = "hello";
        String anagram2_s2 = "world";
        String anagram3_s1 = "aab";
        String anagram3_s2 = "aba";
        String anagram4_s1 = "apple";
        String anagram4_s2 = "pale"; // Different lengths
        String anagram5_s1 = "danger";
        String anagram5_s2 = "garden";

        System.out.println("Are \"" + anagram1_s1 + "\" and \"" + anagram1_s2 + "\" anagrams? → " + StringUtils.anagramcheck(anagram1_s1, anagram1_s2)); // Expected: true
        System.out.println("Are \"" + anagram2_s1 + "\" and \"" + anagram2_s2 + "\" anagrams? → " + StringUtils.anagramcheck(anagram2_s1, anagram2_s2)); // Expected: false
        System.out.println("Are \"" + anagram3_s1 + "\" and \"" + anagram3_s2 + "\" anagrams? → " + StringUtils.anagramcheck(anagram3_s1, anagram3_s2)); // Expected: true
        System.out.println("Are \"" + anagram4_s1 + "\" and \"" + anagram4_s2 + "\" anagrams? → " + StringUtils.anagramcheck(anagram4_s1, anagram4_s2)); // Expected: false (due to length)
        System.out.println("Are \"" + anagram5_s1 + "\" and \"" + anagram5_s2 + "\" anagrams? → " + StringUtils.anagramcheck(anagram5_s1, anagram5_s2)); // Expected: true
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Count Character Frequencies
        // ================================
        String freqStr1 = "hello";
        String freqStr2 = "Programming"; // Test with mixed case for lowercase conversion
        String freqStr3 = "zzzaaab";
        String freqStr4 = ""; // Empty string

        System.out.println("Frequencies for \"" + freqStr1 + "\": " + StringUtils.charFrequencies(freqStr1));
        System.out.println("Frequencies for \"" + freqStr2 + "\": " + StringUtils.charFrequencies(freqStr2));
        System.out.println("Frequencies for \"" + freqStr3 + "\": " + StringUtils.charFrequencies(freqStr3));
        System.out.println("Frequencies for \"" + freqStr4 + "\": " + StringUtils.charFrequencies(freqStr4));
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ First Non-Repeating Character
        // ================================
        String nonRepStr1 = "leetcode";
        String nonRepStr2 = "loveleetcode";
        String nonRepStr3 = "aabbcc"; // No non-repeating chars
        String nonRepStr4 = "Programming"; // Mixed case, spaces, symbols
        String nonRepStr5 = "i am edy"; // Spaces, all letters unique initially

        System.out.println("First non-repeating in \"" + nonRepStr1 + "\": '" + StringUtils.firstNonRepeatingChar(nonRepStr1) + "'"); // Expected: 'l'
        System.out.println("First non-repeating in \"" + nonRepStr2 + "\": '" + StringUtils.firstNonRepeatingChar(nonRepStr2) + "'"); // Expected: 'l'
        System.out.println("First non-repeating in \"" + nonRepStr3 + "\": '" + (StringUtils.firstNonRepeatingChar(nonRepStr3) == '\0' ? "Not found" : String.valueOf(StringUtils.firstNonRepeatingChar(nonRepStr3))) + "'"); // Expected: Not found (\0)
        System.out.println("First non-repeating in \"" + nonRepStr4 + "\": '" + StringUtils.firstNonRepeatingChar(nonRepStr4) + "'"); // Expected: 'g' (P, r, o, g, a, m, i, n -> g)
        System.out.println("First non-repeating in \"" + nonRepStr5 + "\": '" + StringUtils.firstNonRepeatingChar(nonRepStr5) + "'"); // Expected: 'i' (filters spaces)
        System.out.println("--------------------------------------------------"); // Separator

        // ================================
        // ✅ Remove Duplicates from Array
        // (In-place using Two Pointers, returns count of unique elements 'k')
        // ================================
        System.out.println("--- Testing Two-Pointer Approach ---");
        int[] arr1_dup = {1, 1, 2};
        int k1 = ArrayUtils.removeDuplicates(arr1_dup);
        System.out.println("Original: [1,1,2] -> k = " + k1 + ", Modified Array: " + Arrays.toString(Arrays.copyOf(arr1_dup, k1)));

        int[] arr2_dup = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = ArrayUtils.removeDuplicates(arr2_dup);
        System.out.println("Original: [0,0,1,1,1,2,2,3,3,4] -> k = " + k2 + ", Modified Array: " + Arrays.toString(Arrays.copyOf(arr2_dup, k2)));

        int[] arr3_dup = {1, 2, 2, 3, 4, 5, 5, 5, 6, 8, 9, 9}; // Your specific example!
        int k3 = ArrayUtils.removeDuplicates(arr3_dup);
        System.out.println("Original: [1,2,2,3,4,5,5,5,6,8,9,9] -> k = " + k3 + ", Modified Array: " + Arrays.toString(Arrays.copyOf(arr3_dup, k3)));

        int[] arr4_dup = {}; // Empty array
        int k4 = ArrayUtils.removeDuplicates(arr4_dup);
        System.out.println("Original: [] -> k = " + k4 + ", Modified Array: " + Arrays.toString(Arrays.copyOf(arr4_dup, k4)));

        int[] arr5_dup = {7}; // Single element
        int k5 = ArrayUtils.removeDuplicates(arr5_dup);
        System.out.println("Original: [7] -> k = " + k5 + ", Modified Array: " + Arrays.toString(Arrays.copyOf(arr5_dup, k5)));

        System.out.println("--------------------------------------------------"); // Separator

        // Uncomment the following block if you enable the `removeDuplicatesSetApproach` in ArrayUtils
        /*
        System.out.println("--- Testing Set Approach (for 'k' return only, NOT in-place/O(1) compliant) ---");
        int[] arr6_set = {1, 1, 2};
        int k6_set = ArrayUtils.removeDuplicatesSetApproach(arr6_set);
        System.out.println("Set Approach: [1,1,2] -> k = " + k6_set);

        int[] arr7_set = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k7_set = ArrayUtils.removeDuplicatesSetApproach(arr7_set);
        System.out.println("Set Approach: [0,0,1,1,1,2,2,3,3,4] -> k = " + k7_set);
        System.out.println("--------------------------------------------------"); // Separator
        */
    }

    // Helper method to format array results (from Two Sum, etc.)
    private static String format(int[] result) {
        return (result != null && result.length == 2) ? result[0] + ", " + result[1] : "No result";
    }
}