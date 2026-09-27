# Last updated: 27/09/2026, 08:34:18
1class Solution(object):
2    def rearrangeArray(self, nums):
3        freq={}
4        for num in nums:
5            freq[num]=freq.get(num,0)+1
6
7        ans =[];
8        while freq:
9            for num in sorted(freq):
10                ans.append(num)
11                freq[num]-=1
12                if freq[num] == 0:
13                    del freq[num]
14        return ans            
15        