package importantproblems;

public class Misc {

    /**
     * Check if a number is a palindrome using String conversion.
     * Time: O(n), Space: O(n)
     */
    public static boolean isNumberPalindromeString(int number) {
        String s = String.valueOf(number);
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Check if a number is a palindrome using numeric reversal (optimized).
     * Time: O(log n), Space: O(1)
     */
    public static boolean isNumberPalindromeInt(int number) {
        if (number < 0) return false; // negative numbers are not palindromes

        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number = number / 10;
        }

        return original == reversed;
    }
}
