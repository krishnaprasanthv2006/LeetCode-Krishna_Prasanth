// Last updated: 11/08/2026, 14:15:54
class Solution {
    public int fib(int n) {
        int i,n1=0,n2=1,n3=0;
        if (n==0||n==1)
        return n;
        else{
        for(i=1;i<n;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        }
           return n3;}

}
}