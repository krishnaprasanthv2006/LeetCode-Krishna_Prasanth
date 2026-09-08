// Last updated: 08/09/2026, 10:11:32
class Solution {
   
    public long maxPairStrength(int[] nums) {
        long maxStrength = 0;
        int n = nums.length;

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                long a = nums[i];
                long b = nums[j];
                long g = gcd(a,b);

                long strength = (a*b)/(g*g);
                maxStrength = Math.max(maxStrength,strength);
            }
        }
        return maxStrength;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a =temp;
        }
        return a;
    }
}