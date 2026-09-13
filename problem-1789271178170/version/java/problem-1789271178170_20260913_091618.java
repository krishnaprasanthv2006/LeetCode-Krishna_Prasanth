// Last updated: 13/09/2026, 09:16:18
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3        for (int i =0;i<n;i++){
4            int k = rowShift[i] % n;
5            int []temp = new int [n];
6            for (int j =0;j<n;j++){
7                temp[j] = grid[i][(j+k)%n];
8            }
9            grid[i]=temp;
10        }
11        int result[][] = new int[n][n];
12
13        for (int j =0;j<n;j++){
14            int k = colShift[j]%n;
15           
16            for (int i = 0;i<n;i++){
17                result[i][j] = grid[(i+k)%n][j];
18            }
19            
20        }
21        return result;
22    }
23}