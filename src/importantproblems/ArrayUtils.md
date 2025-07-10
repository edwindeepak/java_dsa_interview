# ArrayUtils - Revision Notes

## Problem: Two Sum

### Problem Statement:
Given an array of integers and a target, find indices of two numbers that add up to the target.

---

### Approaches:

#### 1. Brute Force
- Use two nested loops to check all pairs.
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Simple but inefficient for large input.

#### 2. Optimized Using HashMap
- Use a HashMap to store numbers and their indices.
- For each element, check if `target - current` exists in the map.
- Time Complexity: O(n)
- Space Complexity: O(n)
- Much faster, trades space for speed.

---

### Key Learnings:
- Importance of using extra data structures for optimization.
- HashMap lookups are O(1) on average.
- Trade-offs between time and space complexity.

---

### Usage:
Call `twoSumBrute` or `twoSumOptimized` methods with input array and target.

---

### Example:
Input: `[2, 7, 11, 15]`, Target: `9`  
Output: `[0, 1]` because `2 + 7 = 9`

---

### Concepts:
- Nested loops
- HashMap usage
- Early return on finding the solution

---

