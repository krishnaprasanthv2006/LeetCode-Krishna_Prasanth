// Last updated: 08/09/2026, 10:13:02
class Solution {
    public int numberOfCuts(int n) {
        if (n==1) 
        return 0;
        if(n%2==1)
        return n;
        else 
        return n/2;
    }
}