// Last updated: 08/09/2026, 19:51:24
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> result = new ArrayList<>();
4
5        if (s.length() < p.length()) {
6            return result;
7        }
8
9        int[] count = new int[26];
10
11        for (char c : p.toCharArray()) {
12            count[c - 'a']++;
13        }
14
15        int left = 0;
16        int right = 0;
17        int remaining = p.length();
18
19        while (right < s.length()) {
20            char c = s.charAt(right);
21
22            if (count[c - 'a'] > 0) {
23                remaining--;
24            }
25
26            count[c - 'a']--;
27            right++;
28
29            if (right - left == p.length()) {
30                if (remaining == 0) {
31                    result.add(left);
32                }
33
34                char leftChar = s.charAt(left);
35
36                if (count[leftChar - 'a'] >= 0) {
37                    remaining++;
38                }
39
40                count[leftChar - 'a']++;
41                left++;
42            }
43        }
44
45        return result;
46    }
47}