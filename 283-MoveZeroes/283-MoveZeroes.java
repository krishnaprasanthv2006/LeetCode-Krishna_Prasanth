// Last updated: 11/08/2026, 14:18:03
class Solution {
    public void moveZeroes(int[] nums) {
   int j = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
     }
    }
}}