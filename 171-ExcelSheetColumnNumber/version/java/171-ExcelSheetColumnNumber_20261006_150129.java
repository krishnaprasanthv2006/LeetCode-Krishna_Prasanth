// Last updated: 06/10/2026, 15:01:29
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int result = 0;
4
5        for (char c : columnTitle.toCharArray()) {
6            result = result * 26 + (c - 'A' + 1);
7        }
8
9        return result;
10    }
11}