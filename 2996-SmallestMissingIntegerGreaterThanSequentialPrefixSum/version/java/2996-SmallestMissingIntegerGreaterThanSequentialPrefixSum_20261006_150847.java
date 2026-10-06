// Last updated: 06/10/2026, 15:08:47
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] == nums[i - 1] + 1)
7                sum += nums[i];
8            else
9                break;
10        }
11
12        while (contains(nums, sum))
13            sum++;
14
15        return sum;
16    }
17
18    private boolean contains(int[] nums, int target) {
19        for (int num : nums) {
20            if (num == target)
21                return true;
22        }
23        return false;
24    }
25}