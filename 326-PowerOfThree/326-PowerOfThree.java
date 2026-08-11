// Last updated: 11/08/2026, 14:17:51
class Solution {
    public boolean isPowerOfThree(int n) {
       if (n<1) 
       return false;
       while(n%3==0)
       n/=3;
       if (n==1)
       return true;
       else 
       return false;
    }
}