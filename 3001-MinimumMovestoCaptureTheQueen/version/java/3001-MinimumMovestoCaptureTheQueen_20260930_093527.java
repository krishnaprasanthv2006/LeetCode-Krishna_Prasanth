// Last updated: 30/09/2026, 09:35:27
1class Solution {
2    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
3
4        if (a == e) {
5            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
6                return 1;
7            }
8        }
9
10        if (b == f) {
11            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
12                return 1;
13            }
14        }
15
16        if (Math.abs(c - e) == Math.abs(d - f)) {
17            if (!isBetween(a, b, c, d, e, f)) {
18                return 1;
19            }
20        }
21
22        return 2;
23    }
24
25    private boolean isBetween(int a, int b, int c, int d, int e, int f) {
26        return Math.abs(a - c) == Math.abs(b - d)
27            && Math.abs(a - e) == Math.abs(b - f)
28            && Math.abs(c - a) + Math.abs(a - e) == Math.abs(c - e);
29    }
30}