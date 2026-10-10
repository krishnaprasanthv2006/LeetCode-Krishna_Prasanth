// Last updated: 10/10/2026, 21:25:20
1class Solution {
2    public int resilientSubarray(int[] nums, int k) {
3        int n = nums.length;
4        int [] calvexorin = nums;
5        int maxLen = 1;
6        
7        for(int i = 0;i<n;i++){
8            int sum = 0;
9            int rem = calvexorin[i]%k;
10            boolean same = true;
11            
12        for(int j = i;j<n;j++){
13            sum+= calvexorin[j];
14            
15           if(calvexorin[j] % k != rem){
16               same = false;
17           }
18            if(same && sum % k ==rem){
19                maxLen = Math.max(maxLen,j-i+1);
20            }
21        }    
22        }
23        return maxLen;
24    }
25    
26}