// Last updated: 30/09/2026, 09:25:50
1import java.util.*;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        Map<Integer, Long> map = new HashMap<>();
6        long sum = 0;
7        long ans = Long.MIN_VALUE;
8
9        for (int num : nums) {
10            sum += num;
11
12            if (map.containsKey(num - k)) {
13                ans = Math.max(ans, sum - map.get(num - k));
14            }
15
16            if (map.containsKey(num + k)) {
17                ans = Math.max(ans, sum - map.get(num + k));
18            }
19
20            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), sum - num));
21        }
22
23        return ans == Long.MIN_VALUE ? 0 : ans;
24    }
25}