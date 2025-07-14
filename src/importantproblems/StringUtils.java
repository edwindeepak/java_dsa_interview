package importantproblems;

import java.util.Arrays;

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
}
