// Last updated: 11/08/2026, 14:15:21
class Solution {
    public int subtractProductAndSum(int n) {
        int d,sum=0,prod=1;
        while(n!=0){
            d = n% 10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        int diff=prod-sum;
        return diff;

        
    }
}