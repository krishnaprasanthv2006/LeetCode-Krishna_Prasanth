// Last updated: 08/09/2026, 19:49:22
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");
5
6        int n = Math.max(v1.length, v2.length);
7
8        for (int i = 0; i < n; i++) {
9            int a = i < v1.length ? Integer.parseInt(v1[i]) : 0;
10            int b = i < v2.length ? Integer.parseInt(v2[i]) : 0;
11
12            if (a < b) return -1;
13            if (a > b) return 1;
14        }
15
16        return 0;
17    }
18}