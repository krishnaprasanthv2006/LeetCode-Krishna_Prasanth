// Last updated: 08/10/2026, 09:13:45
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] count = new int[26];
4
5        for (String word : words) {
6            for (char c : word.toCharArray()) {
7                count[c - 'a']++;
8            }
9        }
10
11        for (int c : count) {
12            if (c % words.length != 0) {
13                return false;
14            }
15        }
16
17        return true;
18    }
19}