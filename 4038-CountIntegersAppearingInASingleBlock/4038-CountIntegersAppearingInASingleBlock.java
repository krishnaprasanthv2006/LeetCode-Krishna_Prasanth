// Last updated: 08/09/2026, 10:11:36
class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,Integer>blocks = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if (i==0 || nums[i] != nums[i-1]){
                blocks.put(nums[i],blocks.getOrDefault(nums[i],0)+1);
            }
        }
        int count =0;
        for(int blockCount :blocks.values()){
            if (blockCount == 1){
                count++;
            }
        }
        return count;
    }
}