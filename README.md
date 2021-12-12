# LeetCodeSolutions
> Answers to the various LeetCode problems

## MaxConsecutiveOnes

Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
```
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
```

Note:
* The input array will only contain 0 and 1.
* The length of input array is a positive integer and will not exceed 10,000

---

## EvenDigits

Given an array nums of integers, return how many of them contain an even number of digits.
 

Example 1:

```
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
```

Example 2:

```
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
```

## Squares of a Sorted Array
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:
```
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
```

Example 2:
```
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

## Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

## Average Salary Excluding the Minimum and Maximum
Example 1:
```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
```

Example 2:
```
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000)/1= 2000
```

Example 3:
```
Input: salary = [6000,5000,4000,3000,2000,1000]
Output: 3500.00000
```

Example 4:
```
Input: salary = [8000,9000,2000,3000,6000,1000]
Output: 4750.00000
```

## Valid Parenthesis

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.

Example 1:
```text
Input: s = "()"
Output: true
```

Example 2:
```text
Input: s = "()[]{}"
Output: true
```

Example 3:
```text
Input: s = "(]"
Output: false
```

Example 4:
```text
Input: s = "([)]"
Output: false
```

Example 5:
```text
Input: s = "{[]}"
Output: true
```

## Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.

Example 1:
![Example 1](img.png)
```text
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
```

Example 2:
![Example 2](img_1.png)
```text
Input: root = [2,1,3]
Output: [2,3,1]
```

Example 3:
```text
Input: root = []
Output: []
```