package importantproblems;

public class MainTest {
    public static void main(String[] args) {

        // ================================
        // ✅ Two Sum (Array)
        // ================================
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum (Brute): " + format(ArrayUtils.twoSumBrute(nums, target)));
        System.out.println("Two Sum (Optimized): " + format(ArrayUtils.twoSumOptimized(nums, target)));

        // ================================
        // ✅ Longest Substring (Sliding Window)
        // ================================
        String input = "edwindeepak";
        System.out.println("Longest Substring (Brute): " + SlidingWindowUtils.longestSubstringBrute(input));
        System.out.println("Longest Substring (Optimized): " + SlidingWindowUtils.longestSubstringOptimized(input));

        // ================================
        // ✅ String Reversal
        // ================================
        String str = "This is a wonderful day!";
        System.out.println("Reversed (Brute): " + StringUtils.reverseBrute(str));
        System.out.println("Reversed (Two Pointer): " + StringUtils.reverseTwoPointer(str));
        System.out.println("Reversed (InBuilt): " + StringUtils.reverseInBuilt(str));
        System.out.println("Reversed (No Spaces): " + StringUtils.reverseNoSpaces(str));

        // ================================
        // ✅ Word Reversal Variations
        // ================================
        String sentence = "Hello world this is Java";
        System.out.println("Each Word Reversed: " + StringUtils.reverseEachWord(sentence));
        System.out.println("Words Reversed Order: " + StringUtils.reverseWordOrder(sentence));

        // ================================
        // ✅ String Palindrome Check
        // ================================
        String pal1 = "A man, a plan, a canal: Panama";
        String pal2 = "This is not a palindrome";
        System.out.println("\"" + pal1 + "\" → Palindrome? " + StringUtils.isPalindrome(pal1));
        System.out.println("\"" + pal2 + "\" → Palindrome? " + StringUtils.isPalindrome(pal2));

        // ================================
        // ✅ Number Palindrome Check
        // ================================
        int num1 = 121;
        int num2 = 12321;
        int num3 = -121;
        int num4 = 1234;

        System.out.println("Is 121 Palindrome (String)? → " + Misc.isNumberPalindromeString(num1));
        System.out.println("Is 1234 Palindrome (String)? → " + Misc.isNumberPalindromeString(num4));
        System.out.println("Is 12321 Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num2));
        System.out.println("Is -121 Palindrome (Int)? → " + Misc.isNumberPalindromeInt(num3));
    }

    private static String format(int[] result) {
        return (result != null && result.length == 2) ? result[0] + ", " + result[1] : "No result";
    }
}
