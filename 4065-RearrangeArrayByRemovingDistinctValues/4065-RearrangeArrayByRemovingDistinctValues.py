# Last updated: 30/09/2026, 09:17:31
class Solution(object):
    def rearrangeArray(self, nums):
        freq={}
        for num in nums:
            freq[num]=freq.get(num,0)+1

        ans =[];
        while freq:
            for num in sorted(freq):
                ans.append(num)
                freq[num]-=1
                if freq[num] == 0:
                    del freq[num]
        return ans            
        