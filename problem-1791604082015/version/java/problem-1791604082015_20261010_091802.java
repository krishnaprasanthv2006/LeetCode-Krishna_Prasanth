// Last updated: 10/10/2026, 09:18:02
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        for (int i = 0; i < flowerbed.length; i++) {
4            if (flowerbed[i] == 0 &&
5                (i == 0 || flowerbed[i - 1] == 0) &&
6                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
7
8                flowerbed[i] = 1;
9                n--;
10            }
11
12            if (n <= 0)
13                return true;
14        }
15
16        return false;
17    }
18}