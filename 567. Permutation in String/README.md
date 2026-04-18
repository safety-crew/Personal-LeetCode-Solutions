# [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/description/)

Given two strings <code>s1</code> and <code>s2</code>, return <code>true</code> if <code>s2</code> contains a <button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_1k_" data-state="closed" class="">permutation</button> of <code>s1</code>, or <code>false</code> otherwise.

In other words, return <code>true</code> if one of <code>s1</code>'s permutations is the substring of <code>s2</code>.

**Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
```

**Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
```

**Constraints:** 

- <code>1 <= s1.length, s2.length <= 10^4</code>
- <code>s1</code> and <code>s2</code> consist of lowercase English letters.
