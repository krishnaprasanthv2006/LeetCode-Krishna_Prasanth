// Last updated: 30/08/2026, 09:06:45
1class Solution {
2    private static final long MOD = 1000000007;
3    public int sumDecoded(long[] nums) {
4        long sum = 0;
5        for (long num :nums){
6            int width = (int) (num % 10);
7            long d = num /10;
8            String s = String.valueOf(d);
9            long x = Long.parseLong(s.substring(0,width));
10            long y = Long.parseLong(s.substring(width));
11            sum = (sum + power (x,y))%MOD;
12        }
13        return (int) sum;
14    }
15    private long power(long base,long exponent){
16        long result = 1;
17        base%=MOD;
18        while (exponent > 0){
19            if (exponent % 2 == 1){
20                result = (result*base)%MOD;
21            }
22            base = (base*base)%MOD;
23            exponent /= 2;
24        }
25        return result;
26    }
27}