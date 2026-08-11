// Last updated: 11/08/2026, 14:18:45
class Solution {
    public boolean isHappy(int n) {
        int sqr,sum,d;
        sqr=d=0;
        while(n!=1&&n!=4){                     //n=4 is a special case
            sum=0;
        while(n!=0){
            d=n%10;
            sqr=d*d;
            sum+=sqr;
            n/=10;
        }
        n=sum;
    }
       if(n==1)
       return true; 
       return false;
    }
}