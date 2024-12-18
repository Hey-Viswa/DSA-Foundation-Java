# 🔍 Search Algorithms Practice Guide

Welcome to your comprehensive guide on **Linear Search** and **Binary Search**! This document provides a curated list of practice problems to help you master these fundamental search algorithms. Each problem includes a brief description and links to relevant problems on **LeetCode** and **GeeksforGeeks (GFG)**. Use this guide to enhance your problem-solving skills and prepare for coding interviews.

---

## 📜 Table of Contents

- [📚 Linear Search Practice Problems](#-linear-search-practice-problems)
    - [1. Find if an Element Exists in an Unsorted Array](#1-find-if-an-element-exists-in-an-unsorted-array)
    - [2. Count the Number of Occurrences of a Target](#2-count-the-number-of-occurrences-of-a-target)
    - [3. Find the Maximum and Minimum Elements in an Array](#3-find-the-maximum-and-minimum-elements-in-an-array)
    - [4. Find All Indices of a Given Target in an Array](#4-find-all-indices-of-a-given-target-in-an-array)
    - [5. Find the First Non-Repeating Element in an Array](#5-find-the-first-non-repeating-element-in-an-array)
- [📈 Binary Search Practice Problems](#-binary-search-practice-problems)
    - [1. Search a Given Element in a Sorted Array](#1-search-a-given-element-in-a-sorted-array)
    - [2. Find the First Occurrence of a Target in a Sorted Array](#2-find-the-first-occurrence-of-a-target-in-a-sorted-array)
    - [3. Find the Last Occurrence of a Target in a Sorted Array](#3-find-the-last-occurrence-of-a-target-in-a-sorted-array)
    - [4. Find the Peak Element in an Array](#4-find-the-peak-element-in-an-array)
    - [5. Find the Square Root of an Integer (Integer Part Only)](#5-find-the-square-root-of-an-integer-integer-part-only)
    - [6. Find the Smallest Element in a Rotated Sorted Array](#6-find-the-smallest-element-in-a-rotated-sorted-array)
    - [7. Search in a Sorted and Rotated Array](#7-search-in-a-sorted-and-rotated-array)
    - [8. Find the Median of Two Sorted Arrays](#8-find-the-median-of-two-sorted-arrays)
    - [9. Find the Rotation Count in a Rotated Sorted Array](#9-find-the-rotation-count-in-a-rotated-sorted-array)
    - [10. Find the Element in an Infinite Sorted Array](#10-find-the-element-in-an-infinite-sorted-array)
- [🔄 Mixed Practice Problems (Linear or Binary Search)](#-mixed-practice-problems-linear-or-binary-search)
    - [1. Find the Missing Number in an Array](#1-find-the-missing-number-in-an-array)
    - [2. Find the Element that Appears Once in a Sorted Array](#2-find-the-element-that-appears-once-in-a-sorted-array)
    - [3. Search Insert Position](#3-search-insert-position)
    - [4. Find the First and Last Position of Element in Sorted Array](#4-find-the-first-and-last-position-of-element-in-sorted-array)
    - [5. Find the Kth Smallest Element in a Sorted Matrix](#5-find-the-kth-smallest-element-in-a-sorted-matrix)
- [📝 Summary of Available Practice Problems](#-summary-of-available-practice-problems)
- [📖 Additional Tips for Practicing Search Problems](#-additional-tips-for-practicing-search-problems)
- [🏁 Conclusion](#-conclusion)

---

## 📚 Linear Search Practice Problems

**Linear Search** is ideal for unsorted or small datasets where the overhead of sorting isn't justified. Below are some practice problems categorized under Linear Search, along with their availability on LeetCode and GeeksforGeeks.

### 1. Find if an Element Exists in an Unsorted Array

**Description:**  
Given an unsorted array of integers and a target value, determine whether the target exists in the array.

- **LeetCode:**  
  While there's no direct problem, implementing a simple search as part of custom problems or tutorials is common.

- **GeeksforGeeks:**  
  [Search an element in an unsorted array](https://www.geeksforgeeks.org/search-an-element-in-an-unsorted-array-using-linear-search/)

### 2. Count the Number of Occurrences of a Target

**Description:**  
Given an array of integers (which may contain duplicates) and a target value, count how many times the target appears in the array.

- **LeetCode:**  
  [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) *(Related concept)*

- **GeeksforGeeks:**  
  [Count occurrences of a number in a sorted array](https://www.geeksforgeeks.org/count-occurrences-number-sorted-array/)

### 3. Find the Maximum and Minimum Elements in an Array

**Description:**  
Given an array of integers, find both the maximum and minimum elements without using built-in functions.

- **LeetCode:**  
  No direct problem, but similar logic can be applied in various problems.

- **GeeksforGeeks:**  
  [Find the minimum and maximum element in an array](https://www.geeksforgeeks.org/find-the-minimum-and-maximum-element-in-an-array/)

### 4. Find All Indices of a Given Target in an Array

**Description:**  
Given an array of integers and a target value, return a list of all indices where the target appears.

- **LeetCode:**  
  [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)  
  *(Adaptable for unsorted arrays by collecting all matching indices.)*

- **GeeksforGeeks:**  
  [Find all indices of a number in a given array](https://www.geeksforgeeks.org/find-all-indices-of-a-number-in-a-given-array/)

### 5. Find the First Non-Repeating Element in an Array

**Description:**  
Given an array of integers, find the first element that does not repeat.

- **LeetCode:**  
  [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)  
  *(Applies to strings but the logic can be extended to arrays.)*

- **GeeksforGeeks:**  
  [Find the first non-repeating element in an array](https://www.geeksforgeeks.org/find-the-first-repeating-element-in-an-array/)

---

## 📈 Binary Search Practice Problems

**Binary Search** is highly efficient for large, sorted datasets. Below are problems that are best solved using Binary Search or its variations, along with their availability on LeetCode and GeeksforGeeks.

### 1. Search a Given Element in a Sorted Array

**Description:**  
Given a sorted array of integers and a target value, find the index of the target using Binary Search. If the target is not present, return `-1`.

- **LeetCode:**  
  [Binary Search](https://leetcode.com/problems/binary-search/)

- **GeeksforGeeks:**  
  [Binary search](https://www.geeksforgeeks.org/binary-search/)

### 2. Find the First Occurrence of a Target in a Sorted Array

**Description:**  
Given a sorted array that may contain duplicates, find the index of the first occurrence of the target value.

- **LeetCode:**  
  [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

- **GeeksforGeeks:**  
  [Find the first occurrence of a given number in a sorted array](https://www.geeksforgeeks.org/find-first-occurrence-of-a-given-number-in-a-sorted-array/)

### 3. Find the Last Occurrence of a Target in a Sorted Array

**Description:**  
Given a sorted array that may contain duplicates, find the index of the last occurrence of the target value.

- **LeetCode:**  
  [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

- **GeeksforGeeks:**  
  [Find the last occurrence of a given number in a sorted array](https://www.geeksforgeeks.org/find-last-occurrence-of-a-given-number-in-a-sorted-array/)

### 4. Find the Peak Element in an Array

**Description:**  
A peak element is an element that is greater than its neighbors. Given an array, find any one peak element's index. Assume that `arr[-1] = arr[n] = -∞`.

- **LeetCode:**  
  [Find Peak Element](https://leetcode.com/problems/find-peak-element/)

- **GeeksforGeeks:**  
  [Find a peak element in an array](https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/)

### 5. Find the Square Root of an Integer (Integer Part Only)

**Description:**  
Given a non-negative integer `x`, compute and return the square root of `x`. Since the return type is an integer, the decimal digits are truncated, and only the integer part is returned.

- **LeetCode:**  
  [Sqrt(x)](https://leetcode.com/problems/sqrtx/)

- **GeeksforGeeks:**  
  [Compute square root of a number](https://www.geeksforgeeks.org/square-root-of-an-integer/)

### 6. Find the Smallest Element in a Rotated Sorted Array

**Description:**  
Given a rotated sorted array where the array was originally sorted in ascending order but then rotated, find the minimum element.

- **LeetCode:**  
  [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

- **GeeksforGeeks:**  
  [Find minimum element in a sorted and rotated array](https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/)

### 7. Search in a Sorted and Rotated Array

**Description:**  
Given a sorted and rotated array, search for a target value and return its index. If not found, return `-1`.

- **LeetCode:**  
  [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)

- **GeeksforGeeks:**  
  [Search an element in a sorted and rotated array](https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-rotated-array/)

### 8. Find the Median of Two Sorted Arrays

**Description:**  
Given two sorted arrays, find the median of the combined sorted array without merging them.

- **LeetCode:**  
  [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

- **GeeksforGeeks:**  
  [Median of two sorted arrays of different sizes](https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/)

### 9. Find the Rotation Count in a Rotated Sorted Array

**Description:**  
Given a rotated sorted array, find the number of times the array has been rotated. This is equivalent to finding the index of the minimum element.

- **LeetCode:**  
  [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)  
  *(The index of the minimum element indicates the rotation count.)*

- **GeeksforGeeks:**  
  [Find the rotation count in a rotated sorted array](https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/)

### 10. Find the Element in an Infinite Sorted Array

**Description:**  
Imagine you have an infinite sorted array (or an array with unknown size). Given a target value, find its index. You cannot determine the size beforehand.

- **LeetCode:**  
  [Search in a Sorted Array of Unknown Size](https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/)

- **GeeksforGeeks:**  
  [Search an element in an infinite sorted array](https://www.geeksforgeeks.org/search-an-element-in-an-infinite-sorted-array/)

---

## 🔄 Mixed Practice Problems (Linear or Binary Search)

Some problems can be approached using either **Linear Search** or **Binary Search**, depending on the data's nature and size.

### 1. Find the Missing Number in an Array

**Description:**  
Given a sorted array containing `n` distinct numbers taken from `0` to `n`, find the one number that is missing from the array.

- **LeetCode:**  
  [Missing Number](https://leetcode.com/problems/missing-number/)

- **GeeksforGeeks:**  
  [Missing number in a sorted array](https://www.geeksforgeeks.org/find-missing-number-sorted-array/)

### 2. Find the Element that Appears Once in a Sorted Array

**Description:**  
In a sorted array where every element appears twice except for one, find that single element.

- **LeetCode:**  
  [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)

- **GeeksforGeeks:**  
  [Find the element that appears once in a sorted array](https://www.geeksforgeeks.org/find-the-element-that-appears-once-in-sorted-array/)

### 3. Search Insert Position

**Description:**  
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

- **LeetCode:**  
  [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

- **GeeksforGeeks:**  
  [Search Insert Position](https://www.geeksforgeeks.org/search-insert-position/)

### 4. Find the First and Last Position of Element in Sorted Array

**Description:**  
Given a sorted array of integers, find the starting and ending position of a given target value. If the target is not found, return `[-1, -1]`.

- **LeetCode:**  
  [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

- **GeeksforGeeks:**  
  [Find first and last position of an element in a sorted array](https://www.geeksforgeeks.org/find-first-and-last-position-element-sorted-array/)

### 5. Find the Kth Smallest Element in a Sorted Matrix

**Description:**  
Given a `n x n` matrix where each row and each column is sorted in ascending order, find the kth smallest element in the matrix.

- **LeetCode:**  
  [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)

- **GeeksforGeeks:**  
  [Kth smallest element in a sorted matrix](https://www.geeksforgeeks.org/kth-smallest-element-in-a-sorted-matrix/)

---

## 📝 Summary of Available Practice Problems

| **Problem**                                                        | **LeetCode**                                                                                                      | **GeeksforGeeks**                                                                                                    |
|--------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| **Linear Search Problems**                                         |                                                                                                                   |                                                                                                                       |
| 1. Search in an Unsorted Array                                     | *No direct problem*                                                                                                | [Link](https://www.geeksforgeeks.org/search-an-element-in-an-unsorted-array-using-linear-search/)                   |
| 2. Count the Number of Occurrences of a Target                     | *No direct problem*                                                                                                | [Link](https://www.geeksforgeeks.org/count-occurrences-number-sorted-array/)                                         |
| 3. Find Maximum and Minimum Elements in an Array                   | *No direct problem*                                                                                                | [Link](https://www.geeksforgeeks.org/find-the-minimum-and-maximum-element-in-an-array/)                               |
| 4. Find All Indices of a Given Target in an Array                  | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) *(adapted)* | [Link](https://www.geeksforgeeks.org/find-all-indices-of-a-number-in-a-given-array/)                                 |
| 5. Find the First Non-Repeating Element in an Array                | [First Unique Character](https://leetcode.com/problems/first-unique-character-in-a-string/) *(for strings)*      | [Link](https://www.geeksforgeeks.org/find-the-first-repeating-element-in-an-array/)                                  |
| **Binary Search Problems**                                        |                                                                                                                   |                                                                                                                       |
| 1. Search a Given Element in a Sorted Array                        | [Binary Search](https://leetcode.com/problems/binary-search/)                                                      | [Link](https://www.geeksforgeeks.org/binary-search/)                                                                 |
| 2. Find the First Occurrence of a Target in a Sorted Array         | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Link](https://www.geeksforgeeks.org/find-first-occurrence-of-a-given-number-in-a-sorted-array/)                      |
| 3. Find the Last Occurrence of a Target in a Sorted Array          | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Link](https://www.geeksforgeeks.org/find-last-occurrence-of-a-given-number-in-a-sorted-array/)                       |
| 4. Find the Peak Element in an Array                                | [Find Peak Element](https://leetcode.com/problems/find-peak-element/)                                               | [Link](https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/)                                                   |
| 5. Find the Square Root of an Integer (Integer Part Only)          | [Sqrt(x)](https://leetcode.com/problems/sqrtx/)                                                                    | [Link](https://www.geeksforgeeks.org/square-root-of-an-integer/)                                                      |
| 6. Find the Smallest Element in a Rotated Sorted Array              | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)          | [Link](https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/)                              |
| 7. Search in a Sorted and Rotated Array                            | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)                      | [Link](https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-rotated-array/)                                |
| 8. Find the Median of Two Sorted Arrays                             | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)                            | [Link](https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/)                                 |
| 9. Find the Rotation Count in a Rotated Sorted Array                | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) *(index of min = rotation count)* | [Link](https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/)                                       |
| 10. Find the Element in an Infinite Sorted Array                    | [Search in a Sorted Array of Unknown Size](https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/) | [Link](https://www.geeksforgeeks.org/search-an-element-in-an-infinite-sorted-array/)                                 |
| **Mixed Practice Problems**                                        |                                                                                                                   |                                                                                                                       |
| 1. Find the Missing Number in an Array                              | [Missing Number](https://leetcode.com/problems/missing-number/)                                                    | [Link](https://www.geeksforgeeks.org/find-missing-number-sorted-array/)                                              |
| 2. Find the Element that Appears Once in a Sorted Array             | [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/)               | [Link](https://www.geeksforgeeks.org/find-the-element-that-appears-once-in-sorted-array/)                           |
| 3. Search Insert Position                                          | [Search Insert Position](https://leetcode.com/problems/search-insert-position/)                                     | [Link](https://www.geeksforgeeks.org/search-insert-position/)                                                        |
| 4. Find the First and Last Position of Element in Sorted Array      | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Link](https://www.geeksforgeeks.org/find-first-and-last-position-element-sorted-array/)                             |
| 5. Find the Kth Smallest Element in a Sorted Matrix                  | [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/) | [Link](https://www.geeksforgeeks.org/kth-smallest-element-in-a-sorted-matrix/)                                       |

---

## 📖 Additional Tips for Practicing Search Problems

1. **Understand the Problem Constraints:**
    - Determine if the array is sorted or not.
    - Check for duplicates.
    - Consider the size of the array.

2. **Choose the Right Approach:**
    - Use **Linear Search** for small or unsorted arrays.
    - Use **Binary Search** for large, sorted arrays to optimize performance.

3. **Practice Edge Cases:**
    - Empty arrays.
    - Single-element arrays.
    - Targets at the boundaries (first or last elements).
    - Arrays with all elements identical.

4. **Optimize Your Code:**
    - Ensure your Binary Search implementation handles integer overflow when calculating the middle index (use `mid = low + (high - low) / 2` instead of `(low + high) / 2`).
    - Consider iterative vs. recursive implementations.

5. **Time and Space Complexity Analysis:**
    - Always analyze the time and space complexity of your solution to understand its efficiency.

---

## 🏁 Conclusion

By working through these practice problems, you will enhance your understanding of both **Linear Search** and **Binary Search** algorithms. Recognizing when to apply each technique based on the data's nature and size is crucial for efficient problem-solving. Additionally, practicing these problems will help you:

- **Strengthen Algorithm Design Skills:** Learn how to modify basic search algorithms to fit various problem requirements.
- **Improve Code Implementation:** Write clean and efficient code while handling different edge cases.
- **Optimize Solutions:** Aim for solutions that minimize time and space complexity.

Happy Coding! 🚀
