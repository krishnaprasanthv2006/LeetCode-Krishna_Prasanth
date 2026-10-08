// Last updated: 08/10/2026, 09:06:26
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        int count = 0;
4        int mid = s.length() / 2;
5
6        for (int i = 0; i < mid; i++) {
7            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
8                count++;
9            }
10        }
11
12        for (int i = mid; i < s.length(); i++) {
13            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
14                count--;
15            }
16        }
17
18        return count == 0;
19    }
20}