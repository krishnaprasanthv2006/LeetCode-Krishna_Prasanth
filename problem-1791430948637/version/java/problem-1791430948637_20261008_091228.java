// Last updated: 08/10/2026, 09:12:28
1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] result = new String[words.length];
5
6        for (String word : words) {
7            int pos = word.charAt(word.length() - 1) - '0';
8            result[pos - 1] = word.substring(0, word.length() - 1);
9        }
10
11        return String.join(" ", result);
12    }
13}