// Last updated: 18/09/2026, 00:04:58
1class Solution {
2    public int splitArray(int[] nums, int k) {
3
4        int low = 0;
5        int high = 0;
6
7        for (int num : nums) {
8            low = Math.max(low, num);
9            high += num;
10        }
11
12        while (low < high) {
13
14            int mid = low + (high - low) / 2;
15
16            int parts = 1;
17            int sum = 0;
18
19            for (int num : nums) {
20
21                if (sum + num > mid) {
22                    parts++;
23                    sum = num;
24                } else {
25                    sum += num;
26                }
27            }
28
29            if (parts <= k) {
30                high = mid;
31            } else {
32                low = mid + 1;
33            }
34        }
35
36        return low;
37    }
38}