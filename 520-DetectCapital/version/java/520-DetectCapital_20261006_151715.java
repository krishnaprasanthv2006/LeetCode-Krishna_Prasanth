// Last updated: 06/10/2026, 15:17:15
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int upper = 0;
4
5        for (char c : word.toCharArray()) {
6            if (Character.isUpperCase(c))
7                upper++;
8        }
9
10        return upper == 0 || upper == word.length() ||
11               (upper == 1 && Character.isUpperCase(word.charAt(0)));
12    }
13}