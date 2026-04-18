# [953. Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/description/)

In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different <code>order</code>. The <code>order</code> of the alphabet is some permutation of lowercase letters.

Given a sequence of <code>words</code> written in the alien language, and the <code>order</code> of the alphabet, return <code>true</code> if and only if the given <code>words</code> are sorted lexicographically in this alien language.

**Example 1:** 

```
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
```

**Example 2:** 

```
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
```

**Example 3:** 

```
Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (<a href="https://en.wikipedia.org/wiki/Lexicographical_order" target="_blank">More info</a>).
```

**Constraints:** 

- <code>1 <= words.length <= 100</code>
- <code>1 <= words[i].length <= 20</code>
- <code>order.length == 26</code>
- All characters in <code>words[i]</code> and <code>order</code> are English lowercase letters.
