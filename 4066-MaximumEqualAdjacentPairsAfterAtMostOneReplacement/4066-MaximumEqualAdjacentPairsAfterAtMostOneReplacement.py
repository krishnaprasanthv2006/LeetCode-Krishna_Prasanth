# Last updated: 30/09/2026, 09:17:33
class Solution(object):
    def maxEqualAdjacentPairs(self, nums):
        base = 0;
        pairs = {}
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                base += 1
            else:
                a=nums[i]
                b=nums[i+1]

                if a>b:
                    a,b = b,a
                pairs[(a,b)]=pairs.get((a,b),0)+1
        return base + (max(pairs.values())if pairs else 0)    
        