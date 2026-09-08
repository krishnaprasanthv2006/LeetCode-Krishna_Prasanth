// Last updated: 08/09/2026, 10:14:03
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