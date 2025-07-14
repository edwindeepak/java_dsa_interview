# Misc - Revision Notes

This utility class contains problems and variations that don't directly fall under Array, String, or Sliding Window categories.

---

## ✅ Problem 1: Integer Palindrome Check

### 🧾 Problem Statement:

Determine if a given **integer** reads the same forward and backward.

---

## Approaches:

### 1. Convert to String and Use Two Pointers

- Convert the integer to a string.
- Use two pointers (`start`, `end`) to check if characters are equal.
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- ✅ Simple and readable, useful for conceptual clarity.

---

### 2. Reverse the Integer (Mathematical Approach)

- Reverse the number mathematically using modulus and division.
- Compare the reversed number with the original.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- ✅ Efficient and avoids extra memory for string conversion.

---

## 💡 Example:

| Input  | Output | Explanation                     |
|--------|--------|---------------------------------|
| 121    | true   | Same forward and backward       |
| 12321  | true   | Same forward and backward       |
| 1234   | false  | Reversed is 4321, not equal     |
| -121   | false  | Negative numbers not considered |

---

## ✅ Java Usage

```java
Misc.numpali(12321);         // true, prints "Palindrome"
Misc.numpali(12345);         // false, prints "Not a Palindrome"
Misc.secoondpaliapp(121);    // true using reverse integer method
```

---

## 📘 Concepts Covered:

- Two-pointer string-based comparison
- Reversing a number using `reversed = reversed * 10 + num % 10`
- Division to truncate last digit: `num = num / 10`
- Character and digit comparison
- Edge cases like negatives, single digits, and 0

---

## 🧪 Method Summary

| Method Name              | Description                            | Time     | Space    |
|--------------------------|----------------------------------------|----------|----------|
| `numpali(int n)`         | Uses string conversion and 2 pointers  | O(n)     | O(n)     |
| `secoondpaliapp(int n)`  | Uses math to reverse number            | O(log n) | O(1)     |

---

## 🔁 Best Practice:

Use `secoondpaliapp()` (integer reversal) when optimizing for performance and memory — ideal for interviews and real-world scenarios.