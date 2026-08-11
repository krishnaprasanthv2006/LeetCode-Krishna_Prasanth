// Last updated: 11/08/2026, 14:12:55
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