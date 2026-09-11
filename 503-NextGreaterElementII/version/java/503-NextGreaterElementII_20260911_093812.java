// Last updated: 11/09/2026, 09:38:12
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        Arrays.fill(ans, -1);
6
7        Stack<Integer> st = new Stack<>();
8
9        for (int i = 0; i < 2 * n; i++) {
10            int curr = nums[i % n];
11
12            while (!st.isEmpty() && nums[st.peek()] < curr) {
13                ans[st.pop()] = curr;
14            }
15
16            if (i < n) {
17                st.push(i);
18            }
19        }
20
21        return ans;
22    }
23}