package importantproblems;

public class MainTest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] resultBrute = ArrayUtils.twoSumBrute(nums, target);
        System.out.println("Two Sum Brute: " + (resultBrute != null ? resultBrute[0] + ", " + resultBrute[1] : "No result"));

        int[] resultOpt = ArrayUtils.twoSumOptimized(nums, target);
        System.out.println("Two Sum Optimized: " + (resultOpt != null ? resultOpt[0] + ", " + resultOpt[1] : "No result"));

        String s = "edwindeepak";
        int longestBrute = SlidingWindowUtils.longestSubstringBrute(s);
        System.out.println("Longest Substring Brute: " + longestBrute);

        int longestOpt = SlidingWindowUtils.longestSubstringOptimized(s);
        System.out.println("Longest Substring Optimized: " + longestOpt);
    }
}
