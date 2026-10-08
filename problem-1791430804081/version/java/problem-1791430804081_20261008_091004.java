// Last updated: 08/10/2026, 09:10:04
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] words = s.split(" ");
4        StringBuilder result = new StringBuilder();
5
6        for (int i = 0; i < k; i++) {
7            if (i > 0) {
8                result.append(" ");
9            }
10            result.append(words[i]);
11        }
12
13        return result.toString();
14    }
15}