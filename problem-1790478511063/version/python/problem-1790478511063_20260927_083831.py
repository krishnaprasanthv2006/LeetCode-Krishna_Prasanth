# Last updated: 27/09/2026, 08:38:31
1class Solution(object):
2    def maxEqualAdjacentPairs(self, nums):
3        base = 0;
4        pairs = {}
5        for i in range(len(nums)-1):
6            if nums[i] == nums[i+1]:
7                base += 1
8            else:
9                a=nums[i]
10                b=nums[i+1]
11
12                if a>b:
13                    a,b = b,a
14                pairs[(a,b)]=pairs.get((a,b),0)+1
15        return base + (max(pairs.values())if pairs else 0)    
16        