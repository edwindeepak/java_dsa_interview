# StringUtils - Revision Notes

## 1. Reverse a String

### Problem Statement  
Given a string, reverse it completely preserving all characters.

---

### Approaches

#### 1. Built-in Method  
- Use Java's `StringBuilder.reverse()` method.  
- Time Complexity: O(n)  
- Space Complexity: O(n)  

#### 2. Brute Force (Character Concatenation)  
- Iterate from end to start and build a new string by concatenation.  
- Time Complexity: O(n²) due to repeated string concatenation.  
- Space Complexity: O(n)  

#### 3. Two-Pointer Swap  
- Convert string to char array.  
- Swap characters from start and end moving towards the center.  
- Time Complexity: O(n)  
- Space Complexity: O(n) due to char array creation.  

---

### Example  

    Input: "hello"  
    Output: "olleh"

---

## 2. Reverse Words in a Sentence

### Problem Statement  
Given a sentence, reverse either:  
- Each word's characters individually, or  
- The order of the words.

---

### Variants & Examples  

| Variation                  | Input                | Output                  |
|----------------------------|----------------------|-------------------------|
| Reverse each word           | "Hello world"        | "olleH dlrow"           |
| Reverse word order          | "Hello world"        | "world Hello"           |
| Reverse both (less common)  | "Hello world"        | "dlrow olleH"           |

---

### Approach  

- Use `String.split(" ")` to get words array.  
- For each word, reverse characters if needed (using any reverse method).  
- Or reverse the entire words array for order reversal.  
- Join back with spaces.

---

## 3. Palindrome Check

### Problem Statement  
Check if a string reads the same forwards and backwards, ignoring cases, spaces, and non-alphanumeric characters.

---

### Approach  

- Normalize string by converting to lowercase.  
- Use two pointers: `start` at 0, `end` at string length - 1.  
- Move `start` forward and `end` backward skipping non-alphanumeric chars (`Character.isLetterOrDigit()`).  
- Compare characters at `start` and `end`.  
- If mismatch, not a palindrome.  
- If pointers cross, it is a palindrome.

---

### Complexity  

| Time Complexity | O(n) |
|-----------------|-------|
| Space Complexity| O(1)  |

---

### Examples  

    Input: "A man, a plan, a canal: Panama"  
    Output: true

    Input: "Hello"  
    Output: false

---

## Key Learnings Summary

- String reversal can be done efficiently with `StringBuilder` or two-pointer swaps.  
- String concatenation in loops is costly (O(n²)) and should be avoided.  
- Splitting strings by spaces is essential for word-based manipulations.  
- Palindrome checks require careful character skipping and normalization.  
- Using `Character.isLetterOrDigit()` helps handle special characters gracefully.

---

## Usage Summary

- Use `reverseInBuilt()` or `reverseTwoPointer()` for string reversal.  
- Use `reverseWordsInSentence()` variants for sentence manipulations.  
- Use `isPalindrome()` for palindrome checks ignoring non-alphanumeric chars.

---

## Code Snippet Samples

```java
// Reverse string with StringBuilder
String reversed = new StringBuilder(input).reverse().toString();

// Two-pointer reverse
char[] arr = input.toCharArray();
int left = 0, right = arr.length - 1;
while (left < right) {
    char temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++; right--;
}
String reversed = new String(arr);

// Palindrome check ignoring cases and special chars
int start = 0, end = s.length() - 1;
while (start < end) {
    if (!Character.isLetterOrDigit(s.charAt(start))) { start++; continue; }
    if (!Character.isLetterOrDigit(s.charAt(end))) { end--; continue; }
    if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
        return false;
    }
    start++; end--;
}
return true;
