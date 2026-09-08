// Last updated: 08/09/2026, 09:59:57
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int left = 0;
4        int right = 0;
5
6        for (int weight : weights) {
7            left = Math.max(left, weight);
8            right += weight;
9        }
10
11        while (left < right) {
12            int mid = left + (right - left) / 2;
13
14            int requiredDays = 1;
15            int currentWeight = 0;
16
17            for (int weight : weights) {
18                if (currentWeight + weight > mid) {
19                    requiredDays++;
20                    currentWeight = 0;
21                }
22
23                currentWeight += weight;
24            }
25
26            if (requiredDays <= days) {
27                right = mid;
28            } else {
29                left = mid + 1;
30            }
31        }
32
33        return left;
34    }
35}