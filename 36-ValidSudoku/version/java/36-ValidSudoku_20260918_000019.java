// Last updated: 18/09/2026, 00:00:19
1import java.util.*;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5
6        HashSet<String> set = new HashSet<>();
7
8        for (int i = 0; i < 9; i++) {
9            for (int j = 0; j < 9; j++) {
10
11                char num = board[i][j];
12
13                if (num == '.') {
14                    continue;
15                }
16
17                String row = num + " found in row " + i;
18                String col = num + " found in col " + j;
19                String box = num + " found in box " + (i / 3) + "-" + (j / 3);
20
21                if (!set.add(row) || !set.add(col) || !set.add(box)) {
22                    return false;
23                }
24            }
25        }
26
27        return true;
28    }
29}