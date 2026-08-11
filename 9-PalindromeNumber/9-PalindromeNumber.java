// Last updated: 11/08/2026, 14:21:06
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int d;
        int rev=0;
        if(x<0)
        return false;
        else if (x==0)
        return true;
        while(x!=0){
            d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        return temp==rev;


    }
}