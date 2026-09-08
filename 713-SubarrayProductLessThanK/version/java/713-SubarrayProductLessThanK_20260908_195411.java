// Last updated: 08/09/2026, 19:54:11
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if (k <= 1) {
4            return 0;
5        }
6
7        int left = 0;
8        int product = 1;
9        int count = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12            product *= nums[right];
13
14            while (product >= k) {
15                product /= nums[left];
16                left++;
17            }
18
19            count += right - left + 1;
20        }
21
22        return count;
23    }
24}