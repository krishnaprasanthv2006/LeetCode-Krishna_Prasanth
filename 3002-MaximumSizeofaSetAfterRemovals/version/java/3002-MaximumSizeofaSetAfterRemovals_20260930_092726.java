// Last updated: 30/09/2026, 09:27:26
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        Set<Integer> set1 = new HashSet<>();
6        Set<Integer> set2 = new HashSet<>();
7
8        for (int num : nums1) {
9            set1.add(num);
10        }
11
12        for (int num : nums2) {
13            set2.add(num);
14        }
15
16        int n = nums1.length;
17
18        int common = 0;
19
20        for (int num : set1) {
21            if (set2.contains(num)) {
22                common++;
23            }
24        }
25
26        int only1 = set1.size() - common;
27        int only2 = set2.size() - common;
28
29        int take1 = Math.min(only1, n / 2);
30        int take2 = Math.min(only2, n / 2);
31
32        int remaining = n / 2 - take1 + n / 2 - take2;
33
34        return take1 + take2 + Math.min(common, remaining);
35    }
36}