# [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/description/)

You are given an array of integers<code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

**Example 1:** 

```
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       **3** 
 1 [3  -1  -3] 5  3  6  7       **3** 
 1  3 [-1  -3  5] 3  6  7      ** 5** 
 1  3  -1 [-3  5  3] 6  7       **5** 
 1  3  -1  -3 [5  3  6] 7       **6** 
 1  3  -1  -3  5 [3  6  7]      **7** 
```

**Example 2:** 

```
Input: nums = [1], k = 1
Output: [1]
```

**Constraints:** 

- <code>1 <= nums.length <= 10^5</code>
- <code>-10^4 <= nums[i] <= 10^4</code>
- <code>1 <= k <= nums.length</code>
