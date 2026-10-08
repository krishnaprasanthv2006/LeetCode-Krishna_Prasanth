// Last updated: 08/10/2026, 09:11:12
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        boolean[] seen = new boolean[26];
4
5        for (char c : sentence.toCharArray()) {
6            seen[c - 'a'] = true;
7        }
8
9        for (boolean b : seen) {
10            if (!b) {
11                return false;
12            }
13        }
14
15        return true;
16    }
17}