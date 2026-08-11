// Last updated: 11/08/2026, 14:18:07
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int m;
        int n=nums.length;
        int sum=0;
        while(i<n){
        sum+=nums[i];
        i++;}
        m=n*(n+1)/2;
        int ans=m-sum;
        return ans;
        }
    }
