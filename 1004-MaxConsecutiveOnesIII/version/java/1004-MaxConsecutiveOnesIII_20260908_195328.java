// Last updated: 08/09/2026, 19:53:28
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int zeros = 0;
5        int max = 0;
6
7        for (int right = 0; right < nums.length; right++) {
8            if (nums[right] == 0) {
9                zeros++;
10            }
11
12            while (zeros > k) {
13                if (nums[left] == 0) {
14                    zeros--;
15                }
16                left++;
17            }
18
19            max = Math.max(max, right - left + 1);
20        }
21
22        return max;
23    }
24}