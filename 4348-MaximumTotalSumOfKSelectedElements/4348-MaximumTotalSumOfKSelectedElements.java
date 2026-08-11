// Last updated: 11/08/2026, 14:13:17
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int mult[]=new int [k];
        for(int i = 0;i<k;i++){
            mult[i]=mul-i;
        }
        Arrays.sort(mult);
        long ans =0;
        int n=nums.length;
        for (int i =0;i<k;i++){
            long x=nums[n-1-i];
            long m = mult[k-1-i];
            ans+=Math.max(x,x*m);
        }
        return ans;
    }
}