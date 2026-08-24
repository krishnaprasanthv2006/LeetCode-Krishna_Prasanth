// Last updated: 24/08/2026, 09:29:47
1class Solution {
2    public int missingNumber(int[] nums) {
3        int res = nums.length;
4        
5        for (int i = 0; i < nums.length; i++) {
6            res += i - nums[i];
7        }
8        
9        return res;       
10    }
11}