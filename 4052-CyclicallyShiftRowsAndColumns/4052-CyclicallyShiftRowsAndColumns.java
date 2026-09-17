// Last updated: 17/09/2026, 11:32:20
class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for (int i =0;i<n;i++){
            int k = rowShift[i] % n;
            int []temp = new int [n];
            for (int j =0;j<n;j++){
                temp[j] = grid[i][(j+k)%n];
            }
            grid[i]=temp;
        }
        int result[][] = new int[n][n];

        for (int j =0;j<n;j++){
            int k = colShift[j]%n;
           
            for (int i = 0;i<n;i++){
                result[i][j] = grid[(i+k)%n][j];
            }
            
        }
        return result;
    }
}