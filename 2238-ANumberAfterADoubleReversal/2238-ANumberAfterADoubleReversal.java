// Last updated: 11/08/2026, 14:14:29
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int d,reversed1=0,reversed2=0;
        while(num!=0){
            d=num%10;
            reversed1=reversed1*10+d;
            num/=10;
        }
        while(reversed1!=0){
            d=reversed1%10;
            reversed2=reversed2*10+d;
            reversed1/=10;
        }
        if (temp==reversed2)
        return true;
        else 
        return false;
    }
}