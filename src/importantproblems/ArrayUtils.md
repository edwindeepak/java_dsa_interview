# ArrayUtils - Revision Notes

## Problem 1: Two Sum

### Problem Statement
Given an integer array and a target value, find indices of two numbers such that they add up to the target.

---

### Approaches

#### 1. Brute Force
- Check every pair of numbers using two nested loops.
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Simple but inefficient for large inputs.

#### 2. Optimized Using HashMap
- Use a HashMap to store elements and their indices.
- For each element, check if `(target - element)` exists in the map.
- Time Complexity: O(n)
- Space Complexity: O(n)
- Much faster due to O(1) average-time lookups in the HashMap.

---

### Key Learnings
- Using extra data structures like HashMap can optimize runtime.
- Trade-offs exist between time and space complexity.
- Early exit as soon as the pair is found reduces unnecessary checks.

---

### Usage
Call `twoSumBrute(nums, target)` or `twoSumOptimized(nums, target)` with your input.

---

### Example
Input: `[2, 7, 11, 15]`, Target: `9`  
Output: `[0, 1]` since `2 + 7 = 9`

---

---

## Problem 2: Remove Duplicates from Sorted Array (In-place)

### Problem Statement
Given a sorted integer array, remove duplicates in-place such that each element appears only once and return the new length.

---

### Approach

- Use two pointers: `writeIndex` to place the next unique element, and `readIndex` to traverse the array.
- When `nums[readIndex]` differs from `nums[writeIndex]`, increment `writeIndex` and copy the new unique element there.
- Time Complexity: O(n)
- Space Complexity: O(1) (in-place)

---

### Key Learnings
- In-place array modification reduces space complexity.
- Two-pointer technique is powerful for array manipulation problems.
- Important to handle edge cases such as empty arrays.

---

### Usage
Call `removeDuplicates(nums)` with a sorted array.

---

### Example
Input: `[0, 0, 1, 1, 2, 3, 3]`  
Output: Length `5`, array modified to `[0, 1, 2, 3, 4, _, _]` (elements after new length irrelevant)

---

### Concepts Covered
- Nested loops
- HashMap usage
- Two-pointer technique
- In-place array modification

---
