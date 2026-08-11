// Last updated: 11/08/2026, 14:19:50
class Solution {
    public void sortColors(int[] nums) {
     int count0=0,count1=0,i;
     int n=nums.length;
        for (i= 0;i<n;i++) {
        if (nums[i]==0)
				count0++;
        else if(nums[i]==1)
				count1++;}

		for (i=0;i<count0;i++) 
			nums[i]=0;
        for (i=count0;i<(count0+count1);i++) 
			nums[i]=1;
		for (i=(count0+count1);i<n;i++) 
			nums[i]=2;
        for (i=0;i<n;i++)
            System.out.print(nums[i]);
            }   
    }
