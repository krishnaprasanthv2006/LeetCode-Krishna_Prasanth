// Last updated: 08/09/2026, 19:54:55
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return atMost(nums, goal) - atMost(nums, goal - 1);
4    }
5
6    private int atMost(int[] nums, int goal) {
7        if (goal < 0) {
8            return 0;
9        }
10
11        int left = 0;
12        int sum = 0;
13        int count = 0;
14
15        for (int right = 0; right < nums.length; right++) {
16            sum += nums[right];
17
18            while (sum > goal) {
19                sum -= nums[left];
20                left++;
21            }
22
23            count += right - left + 1;
24        }
25
26        return count;
27    }
28}