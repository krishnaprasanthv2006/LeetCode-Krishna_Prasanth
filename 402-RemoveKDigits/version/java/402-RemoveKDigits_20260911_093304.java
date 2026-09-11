// Last updated: 11/09/2026, 09:33:04
1class Solution {
2    public String removeKdigits(String num, int k) {
3        StringBuilder st = new StringBuilder();
4
5        for (char c : num.toCharArray()) {
6            while (k > 0 && st.length() > 0 && st.charAt(st.length() - 1) > c) {
7                st.deleteCharAt(st.length() - 1);
8                k--;
9            }
10            st.append(c);
11        }
12
13        while (k > 0) {
14            st.deleteCharAt(st.length() - 1);
15            k--;
16        }
17
18        int i = 0;
19        while (i < st.length() && st.charAt(i) == '0') {
20            i++;
21        }
22
23        String ans = st.substring(i);
24
25        return ans.length() == 0 ? "0" : ans;
26    }
27}