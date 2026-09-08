// Last updated: 08/09/2026, 19:49:54
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long left = 0;
4        long right = (long) Math.sqrt(c);
5
6        while (left <= right) {
7            long sum = left * left + right * right;
8
9            if (sum == c) {
10                return true;
11            } else if (sum < c) {
12                left++;
13            } else {
14                right--;
15            }
16        }
17
18        return false;
19    }
20}