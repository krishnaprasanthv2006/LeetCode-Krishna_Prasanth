// Last updated: 06/10/2026, 15:12:32
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0;
4        int y = 0;
5
6        for (char move : moves.toCharArray()) {
7            if (move == 'U')
8                y++;
9            else if (move == 'D')
10                y--;
11            else if (move == 'L')
12                x--;
13            else
14                x++;
15        }
16
17        return x == 0 && y == 0;
18    }
19}