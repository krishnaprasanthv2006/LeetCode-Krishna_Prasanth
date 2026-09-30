// Last updated: 30/09/2026, 09:36:58
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0;
6        int bottom = n - 1;
7        int left = 0;
8        int right = n - 1;
9        int num = 1;
10
11        while (top <= bottom && left <= right) {
12
13            for (int j = left; j <= right; j++) {
14                matrix[top][j] = num++;
15            }
16            top++;
17
18            for (int i = top; i <= bottom; i++) {
19                matrix[i][right] = num++;
20            }
21            right--;
22
23            for (int j = right; j >= left; j--) {
24                matrix[bottom][j] = num++;
25            }
26            bottom--;
27
28            for (int i = bottom; i >= top; i--) {
29                matrix[i][left] = num++;
30            }
31            left++;
32        }
33
34        return matrix;
35    }
36}