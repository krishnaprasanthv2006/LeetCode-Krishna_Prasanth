// Last updated: 11/08/2026, 14:20:25
import java.util.*;

class Solution {
    private List<List<String>> res = new ArrayList<>();
    private boolean[] cols;
    private boolean[] posDiag;
    private boolean[] negDiag;

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        cols = new boolean[n];
        posDiag = new boolean[2 * n];
        negDiag = new boolean[2 * n];
        
        backtrack(0, n, board);
        return res;
    }

    private void backtrack(int r, int n, char[][] board) {
        if (r == n) {
            res.add(construct(board));
            return;
        }

        for (int c = 0; c < n; c++) {
            // Check conflicts; added offset (n - 1) to negDiag to prevent negative indexing
            if (cols[c] || posDiag[r + c] || negDiag[r - c + n - 1]) {
                continue;
            }

            // Place queen
            board[r][c] = 'Q';
            cols[c] = true;
            posDiag[r + c] = true;
            negDiag[r - c + n - 1] = true;

            backtrack(r + 1, n, board);

            // Backtrack
            board[r][c] = '.';
            cols[c] = false;
            posDiag[r + c] = false;
            negDiag[r - c + n - 1] = false;
        }
    }

    private List<String> construct(char[][] board) {
        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            internal.add(new String(board[i]));
        }
        return internal;
    }
}
