// Last updated: 09/10/2026, 22:07:58
1class Solution {
2    public int countKeyChanges(String s) {
3        int count = 0;
4
5        for (int i = 1; i < s.length(); i++) {
6            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
7                count++;
8            }
9        }
10
11        return count;
12    }
13}