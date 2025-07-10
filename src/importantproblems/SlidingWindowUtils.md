# SlidingWindowUtils - Revision Notes

## Problem: Longest Substring Without Repeating Characters

### Problem Statement:
Given a string, find the length of the longest substring without repeating characters.

---

### Approaches:

#### 1. Brute Force
- Check all possible substrings starting at each index.
- Use a HashSet to detect duplicates.
- Time Complexity: O(n²)
- Space Complexity: O(min(n, m)) where m = charset size.

#### 2. Optimized Sliding Window
- Use two pointers (`start`, `end`) to maintain a window with unique characters.
- Use a HashSet to track current window characters.
- Expand `end` while characters are unique.
- When duplicate found, move `start` forward and remove chars until valid.
- Time Complexity: O(n)
- Space Complexity: O(min(n, m))

---

### Key Learnings:
- Sliding window technique for substring problems.
- Efficiently maintaining a dynamic window of valid data.
- Using HashSet for O(1) checks/removals.

---

### Usage:
Call `longestSubstringBrute` or `longestSubstringOptimized` with the input string.

---

### Example:
Input: `"edwindeepak"`  
Output: `5`  
Explanation: The longest substring without repeating characters is `"edwin"`.

---

### Concepts:
- Sliding window pattern
- HashSet for duplicate detection
- Two-pointer technique

---

