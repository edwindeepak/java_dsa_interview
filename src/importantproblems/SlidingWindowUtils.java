package importantproblems;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowUtils {

    // Longest Substring Without Repeating Characters - Brute Force
    public static int longestSubstringBrute(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if (set.contains(currentChar)) {
                    break;
                }
                set.add(currentChar);
                max = Math.max(max, set.size());
            }
        }
        return max;
    }

    // Longest Substring Without Repeating Characters - Optimized Sliding Window
    public static int longestSubstringOptimized(String s) {
        int max = 0, start = 0, end = 0;
        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            char rightChar = s.charAt(end);
            if (!set.contains(rightChar)) {
                set.add(rightChar);
                end++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
