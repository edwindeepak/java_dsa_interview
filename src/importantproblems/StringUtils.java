package importantproblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
// Removed java.lang.StringBuilder and java.lang.Character imports as they are in java.lang and automatically imported.
// Removed java.util.Map.Entry as Map import is sufficient for Map.Entry usage.

public class StringUtils {

    // -----------------------------------------------
    // 🔁 Reverse a String
    // -----------------------------------------------

    // 1. Using in-built reverse (StringBuilder)
    public static String reverseInBuilt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 2. Brute-force: append characters from end
    public static String reverseBrute(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    // 3. Two-pointer approach: swap in char array
    public static String reverseTwoPointer(String input) {
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // 4. Reverse without spaces
    public static String reverseNoSpaces(String input) {
        input = input.replace(" ", "");
        return reverseTwoPointer(input);
    }

    // -----------------------------------------------
    // 🔁 Reverse Words / Sentences
    // -----------------------------------------------

    // 1. Reverse each word (but not order)
    public static String reverseEachWord(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            result.append(reverseTwoPointer(word)).append(" ");
        }
        return result.toString().trim();
    }

    // 2. Reverse only the word order (not characters)
    public static String reverseWordOrder(String sentence) {
        String[] words = sentence.split(" ");
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }

    // -----------------------------------------------
    // 🔍 Palindrome Check
    // -----------------------------------------------

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase(); // Ensure case-insensitivity
        int left = 0, right = input.length() - 1;
        while (left < right) {
            char l = input.charAt(left);
            char r = input.charAt(right);

            // Skip non-alphanumeric characters for palindrome check
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }
            if (l != r) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // -----------------------------------------------
    // ✅ Anagram Check
    // -----------------------------------------------

    public static boolean anagramcheck(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] counts = new int[26];

        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
            counts[b.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    // -----------------------------------------------
    // ✅ Count Character Frequencies
    // -----------------------------------------------

    public static Map<Character, Integer> charFrequencies(String s) {
        String processedS = s.toLowerCase();
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char c : processedS.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }

    // -----------------------------------------------
    // ✅ First Non-Repeating Character
    // Using int array for frequency (optimized for limited alphabet)
    // -----------------------------------------------

    public static char firstNonRepeatingChar(String s) {
        // Normalize to lowercase to handle case-insensitivity (e.g., 'A' and 'a' count as same)
        String loweredS = s.toLowerCase();

        // Array to store counts for 'a' through 'z'.
        // Index 0 for 'a', 1 for 'b', ..., 25 for 'z'.
        int[] counts = new int[26];

        // First Pass: Count frequencies of letters
        for (char x : loweredS.toCharArray()) {
            // CRITICAL: Only process if it's a lowercase English letter
            if (x >= 'a' && x <= 'z') {
                counts[x - 'a']++;
            }
        }

        // Second Pass: Iterate the ORIGINAL (normalized) string again
        // to find the first character that has a count of 1.
        for (char x : loweredS.toCharArray()) {
            // CRITICAL: Again, only check if it's a lowercase English letter
            if (x >= 'a' && x <= 'z') {
                if (counts[x - 'a'] == 1) { // If count is 1, it's non-repeating
                    return x; // Return this character immediately (it's the first one found)
                }
            }
        }

        // If the loop finishes, it means no non-repeating letter was found.
        // Return '\0' (null character) as per problem specification.
        return '\0';
    }
}