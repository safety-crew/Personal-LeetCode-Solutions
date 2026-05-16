# [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/description/)

Given two strings <code>s</code> and <code>t</code> of lengths <code>m</code> and <code>n</code> respectively, return the **minimum window**  <button type="button" aria-haspopup="dialog" aria-expanded="false" aria-controls="radix-_r_1j_" data-state="closed" class="">**substring** </button> of <code>s</code> such that every character in <code>t</code> (**including duplicates** ) is included in the window. If there is no such substring, return the empty string <code>""</code>.

The testcases will be generated such that the answer is **unique** .

**Example 1:** 

```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
```

**Example 2:** 

```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
```

**Example 3:** 

```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
```

**Constraints:** 

- <code>m == s.length</code>
- <code>n == t.length</code>
- <code>1 <= m, n <= 10^5</code>
- <code>s</code> and <code>t</code> consist of uppercase and lowercase English letters.

**Follow up:**  Could you find an algorithm that runs in <code>O(m + n)</code> time?
