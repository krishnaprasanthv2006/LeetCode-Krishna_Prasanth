// Last updated: 08/09/2026, 10:01:32
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int left = matrix[0][0];
5        int right = matrix[n - 1][n - 1];
6
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9            int count = 0;
10            int row = n - 1;
11            int col = 0;
12
13            while (row >= 0 && col < n) {
14                if (matrix[row][col] <= mid) {
15                    count += row + 1;
16                    col++;
17                } else {
18                    row--;
19                }
20            }
21
22            if (count < k) {
23                left = mid + 1;
24            } else {
25                right = mid;
26            }
27        }
28
29        return left;
30    }
31}