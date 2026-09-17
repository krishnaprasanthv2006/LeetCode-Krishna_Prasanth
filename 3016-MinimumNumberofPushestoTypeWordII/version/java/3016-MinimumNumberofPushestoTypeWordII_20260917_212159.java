// Last updated: 17/09/2026, 21:21:59
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for (char c : word.toCharArray()) {
5            freq[c - 'a']++;
6        }
7
8        Arrays.sort(freq);
9
10        int pushes = 0;
11        int pressCount = 1;
12        int charsUsed = 0;
13
14        // Start from highest frequency
15        for (int i = 25; i >= 0; i--) {
16            if (freq[i] == 0)
17                break;
18
19            pushes += freq[i] * pressCount;
20            charsUsed++;
21
22            if (charsUsed % 8 == 0) {
23                pressCount++;
24            }
25        }
26
27        return pushes;
28    }
29}