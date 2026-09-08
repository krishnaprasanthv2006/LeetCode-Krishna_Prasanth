// Last updated: 08/09/2026, 10:13:49
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int i;
        for(i=1;i<n;i++)
        nums[i]=nums[i]+nums[i-1];
        return nums;
    } 
}