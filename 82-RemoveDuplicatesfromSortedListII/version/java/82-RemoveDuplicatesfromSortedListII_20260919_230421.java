// Last updated: 19/09/2026, 23:04:21
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length())
4            return "";
5
6        int[] count = new int[128];
7
8        for (char c : t.toCharArray()) {
9            count[c]++;
10        }
11
12        int left = 0;
13        int right = 0;
14        int required = t.length();
15        int minLen = Integer.MAX_VALUE;
16        int start = 0;
17
18        while (right < s.length()) {
19            char c = s.charAt(right);
20
21            if (count[c] > 0)
22                required--;
23
24            count[c]--;
25            right++;
26
27            while (required == 0) {
28                if (right - left < minLen) {
29                    minLen = right - left;
30                    start = left;
31                }
32
33                char leftChar = s.charAt(left);
34                count[leftChar]++;
35
36                if (count[leftChar] > 0)
37                    required++;
38
39                left++;
40            }
41        }
42
43        return minLen == Integer.MAX_VALUE
44                ? ""
45                : s.substring(start, start + minLen);
46    }
47}