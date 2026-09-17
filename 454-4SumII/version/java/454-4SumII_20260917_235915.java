// Last updated: 17/09/2026, 23:59:15
1import java.util.*;
2
3class Solution {
4    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
5        
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // Store sums of nums1 + nums2
9        for (int a : nums1) {
10            for (int b : nums2) {
11                int sum = a + b;
12                map.put(sum, map.getOrDefault(sum, 0) + 1);
13            }
14        }
15
16        int count = 0;
17
18        // Find opposite sums in nums3 + nums4
19        for (int c : nums3) {
20            for (int d : nums4) {
21                int sum = c + d;
22                count += map.getOrDefault(-sum, 0);
23            }
24        }
25
26        return count;
27    }
28}