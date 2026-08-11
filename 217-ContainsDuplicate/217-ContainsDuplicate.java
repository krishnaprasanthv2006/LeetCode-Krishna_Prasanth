// Last updated: 11/08/2026, 14:18:27
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return true;
        }
    return false;
    }
}