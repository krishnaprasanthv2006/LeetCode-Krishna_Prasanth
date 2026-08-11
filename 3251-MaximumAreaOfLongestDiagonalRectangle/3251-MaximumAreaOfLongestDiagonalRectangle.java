// Last updated: 11/08/2026, 14:13:26
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonalSq = 0;

        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];

            int diagonalSq = length * length + width * width;
            int area = length * width;

            if (diagonalSq > maxDiagonalSq ||
                (diagonalSq == maxDiagonalSq && area > maxArea)) {
                maxDiagonalSq = diagonalSq;
                maxArea = area;
            }
        }

        return maxArea;
    }
}