package importantproblems;

public class Misc {

    /**
     * Check if an integer is a palindrome by converting to string.
     * Time Complexity: O(n), Space Complexity: O(n)
     * 
     * @param number input integer
     * @return true if palindrome, else false
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
     * Check if an integer is a palindrome using numeric reversal.
     * Time Complexity: O(log n), Space Complexity: O(1)
     * 
     * @param number input integer
     * @return true if palindrome, else false
     */
    public static boolean isNumberPalindromeInt(int number) {
        if (number < 0) return false;  // Negative numbers are not palindrome

        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number = number / 10;
        }

        return original == reversed;
    }
}
