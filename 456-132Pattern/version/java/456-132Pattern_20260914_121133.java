// Last updated: 14/09/2026, 12:11:33
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        Stack<Integer> stack = new Stack<>();
4        int second = Integer.MIN_VALUE;
5
6        for (int i = nums.length - 1; i >= 0; i--) {
7            if (nums[i] < second) {
8                return true;
9            }
10
11            while (!stack.isEmpty() && nums[i] > stack.peek()) {
12                second = stack.pop();
13            }
14
15            stack.push(nums[i]);
16        }
17
18        return false;
19    }
20}