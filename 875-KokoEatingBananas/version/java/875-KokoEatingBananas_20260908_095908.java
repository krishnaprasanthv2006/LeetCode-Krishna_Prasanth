// Last updated: 08/09/2026, 09:59:08
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        
4        int left = 1;
5        int right = 0;
6
7        for (int pile : piles) {
8            right = Math.max(right, pile);
9        }
10        while (left < right) {
11            int mid = left + (right - left) / 2;
12
13            long hours = 0;
14
15            for (int pile : piles) {
16                hours += (pile + mid - 1) / mid;
17            }
18
19            if (hours <= h) {
20                right = mid;     
21            } else {
22                left = mid + 1;    
23            }
24        }
25
26        return left;
27    }
28}