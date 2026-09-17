// Last updated: 17/09/2026, 21:22:37
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4
5        for (int i = 1; i < n; i++) {
6            StringBuilder next = new StringBuilder();
7
8            int count = 1;
9
10            for (int j = 1; j < s.length(); j++) {
11                if (s.charAt(j) == s.charAt(j - 1)) {
12                    count++;
13                } else {
14                    next.append(count);
15                    next.append(s.charAt(j - 1));
16                    count = 1;
17                }
18            }
19
20            next.append(count);
21            next.append(s.charAt(s.length() - 1));
22
23            s = next.toString();
24        }
25
26        return s;
27    }
28}