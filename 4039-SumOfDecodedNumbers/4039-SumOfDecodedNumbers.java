// Last updated: 08/09/2026, 10:11:30
class Solution {
    private static final long MOD = 1000000007;
    public int sumDecoded(long[] nums) {
        long sum = 0;
        for (long num :nums){
            int width = (int) (num % 10);
            long d = num /10;
            String s = String.valueOf(d);
            long x = Long.parseLong(s.substring(0,width));
            long y = Long.parseLong(s.substring(width));
            sum = (sum + power (x,y))%MOD;
        }
        return (int) sum;
    }
    private long power(long base,long exponent){
        long result = 1;
        base%=MOD;
        while (exponent > 0){
            if (exponent % 2 == 1){
                result = (result*base)%MOD;
            }
            base = (base*base)%MOD;
            exponent /= 2;
        }
        return result;
    }
}