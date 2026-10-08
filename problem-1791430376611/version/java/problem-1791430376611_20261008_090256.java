// Last updated: 08/10/2026, 09:02:56
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int[] first = new int[26];
4        java.util.Arrays.fill(first, -1);
5
6        int max = -1;
7
8        for (int i = 0; i < s.length(); i++) {
9            int index = s.charAt(i) - 'a';
10
11            if (first[index] == -1) {
12                first[index] = i;
13            } else {
14                max = Math.max(max, i - first[index] - 1);
15            }
16        }
17
18        return max;
19    }
20}