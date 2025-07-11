package importantproblems;

public class StringUtils {

    /**
     * Reverse a string using Java's built-in StringBuilder.reverse()
     * Time: O(n), Space: O(n)
     */
    public static String reverseInBuilt(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Reverse a string using brute force with character concatenation
     * Time: O(n^2), Space: O(n)
     */
    public static String reverseBrute(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    /**
     * Reverse a string using the two-pointer method (manual character swap)
     * Time: O(n), Space: O(n)
     */
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

    /**
     * Reverse a string and remove all spaces (optional use case)
     */
    public static String reverseNoSpaces(String input) {
        input = input.replace(" ", "");
        return reverseTwoPointer(input); // or reverseInBuilt(input)
    }
}
