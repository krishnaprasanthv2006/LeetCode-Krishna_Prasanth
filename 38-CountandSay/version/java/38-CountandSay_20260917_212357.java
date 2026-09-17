// Last updated: 17/09/2026, 21:23:57
1import java.util.*;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        int n = nums.length;
6        long MOD = 1000000007;
7
8        long[] pos = new long[n];
9
10        // Calculate final positions
11        for (int i = 0; i < n; i++) {
12            if (s.charAt(i) == 'R') {
13                pos[i] = (long) nums[i] + d;
14            } else {
15                pos[i] = (long) nums[i] - d;
16            }
17        }
18
19        // Sort positions
20        Arrays.sort(pos);
21
22        long ans = 0;
23        long prefix = 0;
24
25        // Calculate pairwise distances
26        for (int i = 0; i < n; i++) {
27            ans += pos[i] * i - prefix;
28            ans %= MOD;
29
30            prefix += pos[i];
31        }
32
33        return (int) ans;
34    }
35}