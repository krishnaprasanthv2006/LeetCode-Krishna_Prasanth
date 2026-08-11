// Last updated: 11/08/2026, 14:15:00
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int i;
        for(i=1;i<n;i++)
        nums[i]=nums[i]+nums[i-1];
        return nums;
    } 
}