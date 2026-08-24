# Last updated: 24/08/2026, 09:57:00
1class Solution:
2    def stoneGameVIII(self, stones):
3        n = len(stones)
4
5        prefix = stones[:]
6
7        for i in range(1, n):
8            prefix[i] += prefix[i - 1]
9
10        best = prefix[n - 1]
11
12        for i in range(n - 2, 0, -1):
13            best = max(best, prefix[i] - best)
14
15        return best