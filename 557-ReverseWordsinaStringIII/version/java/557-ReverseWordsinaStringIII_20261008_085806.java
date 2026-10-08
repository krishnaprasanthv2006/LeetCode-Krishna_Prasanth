// Last updated: 08/10/2026, 08:58:06
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        StringBuilder result = new StringBuilder();
5
6        for (String word : words) {
7            result.append(new StringBuilder(word).reverse());
8            result.append(" ");
9        }
10
11        return result.toString().trim();
12    }
13}