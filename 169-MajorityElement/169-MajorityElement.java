// Last updated: 11/08/2026, 14:19:09
class Solution {
    public int majorityElement(int[] nums) {
        int i,count =0;
        Arrays.sort(nums);
        for (i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            count++;
            if (count>=(nums.length/2))
            return nums[i];
      }
      if(nums.length==1)
      return nums[0];
      return 0;
    }
    
}