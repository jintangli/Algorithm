E
1532126087
tags: Greedy, Array, DP, Sequence DP, Subarray
time: O(m)
space: O(1)

给一串数组, unsorted, can have negative/positive num. 找数组中间 subarray 数字之和的最小值

#### DP
- 看到 min value, 至少考虑dp:
- Consider last num: min sum will be (preMinSum + curr, or curr)
- Use preMinSum to cache previouly calcualted min sum, also compare with +curr.
- Have a global min to track: because the preMinSum can be dis-continuous. 
- 也可以写成 dp[i] 但是没什么必要

```

/*
Given an array of integers, find the subarray with smallest sum.

Return the sum of the subarray.

Example
For [1, -1, -2, 1], return -3

Note
The subarray should contain at least one integer.

Tags Expand 
Greedy LintCode Copyright Subarray Array


*/

/*
DP, Sequence DP
Consider last num: min sum will be (preMinSum + curr, or curr)
Use preMinSum to cache previouly calcualted min sum, also compare with +curr.
Have a global min to track: because the preMinSum can be dis-continuous.
*/
public class Solution {
    public int minSubArray(List<Integer> nums) {
        if (nums == null || nums.size() == 0) return Integer.MAX_VALUE;
        int preMinSum = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            preMinSum = Math.min(num, preMinSum + num);
            min = Math.min(min, preMinSum);
        }
        return min;
    }
}

/*
Thoughts:
Note: sub-array has order. It's not sub-set
1. On each index: decide to add with nums.get(i), to use the new lowest value nums.get(i). That means:
	If the new value is negative (it has decresing impact on sum) and the sum is larger than new value, just use the new value.
	In another case, if sum has been nagative, so sum + new value will be even smaller, then use sum.
2. Every time compare the currMin with the overall minimum value, call it minRst.	

Note: remember to pre-set init value for curMin, minRst. 
*/
public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
		if (nums == null || nums.size() == 0) {
			return 0;
		}	
		int curMin = nums.get(0);
		int minRst = nums.get(0);
		for (int i = 1; i < nums.size(); i++) {
			curMin = Math.min(nums.get(i), curMin + nums.get(i));
			minRst = Math.min(curMin, minRst);
		}
		return minRst;
    }
}
```