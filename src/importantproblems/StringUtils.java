package importantproblems;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringUtils {

    // -----------------------------------------------
    // 🔁 Reverse a String
    // -----------------------------------------------

    public static String reverseInBuilt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseBrute(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

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

    public static String reverseNoSpaces(String input) {
        input = input.replace(" ", "");
        return reverseTwoPointer(input);
    }

    // -----------------------------------------------
    // 🔁 Reverse Words / Sentences
    // -----------------------------------------------

    public static String reverseEachWord(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            result.append(reverseTwoPointer(word)).append(" ");
        }
        return result.toString().trim();
    }

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
    // 🔍 Palindrome Check (ignores non-alphanumeric, case-insensitive)
    // -----------------------------------------------

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int left = 0, right = input.length() - 1;
        while (left < right) {
            char l = input.charAt(left);
            char r = input.charAt(right);

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
    // ✅ Anagram Check (case-insensitive)
    // -----------------------------------------------

    public static boolean anagramcheck(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] counts = new int[26];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
            counts[b.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }

    // -----------------------------------------------
    // ✅ Count Character Frequencies (case-insensitive)
    // -----------------------------------------------

    public static Map<Character, Integer> charFrequencies(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }

    // -----------------------------------------------
    // ✅ First Non-Repeating Character (lowercase letters only)
    // -----------------------------------------------

    public static char firstNonRepeatingChar(String s) {
        String lowered = s.toLowerCase();
        int[] counts = new int[26];

        for (char c : lowered.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        for (char c : lowered.toCharArray()) {
            if (c >= 'a' && c <= 'z' && counts[c - 'a'] == 1) {
                return c;
            }
        }

        return '\0'; // null character if none found
    }

    // -----------------------------------------------
    // ✅ Remove Duplicate Characters (preserves order)
    // -----------------------------------------------

    public static String removeDupsString(String s) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
