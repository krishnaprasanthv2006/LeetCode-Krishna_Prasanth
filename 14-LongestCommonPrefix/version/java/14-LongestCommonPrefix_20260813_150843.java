// Last updated: 13/08/2026, 15:08:43
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        for (int i = 0; i < strs[0].length(); i++) {
4            char ch = strs[0].charAt(i);
5
6            for (int j = 1; j < strs.length; j++) {
7                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
8                    return strs[0].substring(0, i);
9                }
10            }
11        }
12
13        return strs[0];
14    }
15}