// Last updated: 11/08/2026, 14:18:10
class Solution {
    public int addDigits(int num) {
        while(num>9){
        int sum=0;
        while(num!=0){
        int d=num%10;
        sum=sum+d;
        num/=10;
        }
        num = sum;
        }
        return num;
    }
}