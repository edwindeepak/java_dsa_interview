# StringUtils - Revision Notes

## Problem: Reverse a String

### Problem Statement:
Given a string, return the reversed version of it. The string may contain spaces, numbers, or special characters.

---

### Approaches:

#### 1. Brute Force (Using Character Concatenation)
- Iterate from the end of the string to the beginning.
- Append each character manually to a new string.
- Time Complexity: O(n²) due to string immutability.
- Space Complexity: O(n)
- ✅ Easy to understand, ❌ inefficient for large strings.

---

#### 2. Optimized (Two-Pointer with Char Array)
- Convert the string to a character array.
- Use two pointers (`left`, `right`) to swap elements.
- Rebuild the reversed string from the array.
- Time Complexity: O(n)
- Space Complexity: O(n)
- ✅ Efficient and interview-friendly.

---

#### 3. Built-in (Using StringBuilder)
- Use Java's `StringBuilder.reverse()` method.
- Time Complexity: O(n)
- Space Complexity: O(n)
- ✅ Cleanest and fastest when built-in is allowed.

---

#### 4. Optional Variant: Reverse Without Spaces
- Use `String.replace(" ", "")` before reversing to remove all spaces.
- Can apply this to any of the above approaches.

---

### Key Learnings:
- Difference between O(n²) string concatenation and O(n) array-based logic.
- Strings are immutable in Java — prefer `StringBuilder` for performance.
- Two-pointer technique is not just for arrays — works great on strings.
- Understand how to adapt for variations like "ignore spaces", "reverse each word", etc.

---

### Usage:
Call `reverseBrute`, `reverseTwoPointer`, or `reverseInBuilt` with the input string.

---

### Example:
**Input**: `"edwin@2025!"`  
**Output**: `"!5202@niwde"`

**Input (with spaces)**: `"This is a wonderful day"`  
**Output (normal)**: `"yad lufrednow a si sihT"`  
**Output (no spaces)**: `"yadlufrednowasisihT"`

---

### Concepts:
- String reversal logic
- String immutability
- Two-pointer algorithm
- Java StringBuilder
- Preprocessing for space removal

---
