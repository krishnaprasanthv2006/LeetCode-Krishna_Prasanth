// Last updated: 14/09/2026, 12:13:38
1class Solution {
2    public int countCompleteSubstrings(String word, int k) {
3        int n = word.length();
4        int ans = 0;
5
6        for (int start = 0; start < n; ) {
7            int end = start + 1;
8
9            while (end < n && Math.abs(word.charAt(end) - word.charAt(end - 1)) <= 2) {
10                end++;
11            }
12
13            for (int distinct = 1; distinct <= 26; distinct++) {
14                int len = distinct * k;
15
16                if (len > end - start) {
17                    break;
18                }
19
20                int[] freq = new int[26];
21
22                for (int i = start; i + len <= end; i++) {
23                    if (i == start) {
24                        for (int j = i; j < i + len; j++) {
25                            freq[word.charAt(j) - 'a']++;
26                        }
27                    } else {
28                        freq[word.charAt(i - 1) - 'a']--;
29                        freq[word.charAt(i + len - 1) - 'a']++;
30                    }
31
32                    boolean valid = true;
33
34                    for (int j = 0; j < 26; j++) {
35                        if (freq[j] != 0 && freq[j] != k) {
36                            valid = false;
37                            break;
38                        }
39                    }
40
41                    if (valid) {
42                        ans++;
43                    }
44                }
45            }
46
47            start = end;
48        }
49
50        return ans;
51    }
52}