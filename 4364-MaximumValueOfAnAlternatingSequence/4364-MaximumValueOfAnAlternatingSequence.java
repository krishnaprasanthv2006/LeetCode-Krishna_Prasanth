// Last updated: 11/08/2026, 14:12:51
class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n==1)
            return s;

        long start =s;
        long maxDiff =m;

        int maxOddIndex=(n%2==0)? n-1:n-2;
        long ups1=(maxOddIndex+1)/2;
        long downs1=(maxOddIndex-1)/2;
        long maxStrategy1=start+(ups1 * maxDiff)-downs1;

        int maxEvenIndex=(n%2!=0)?n-1:n-2;
        long ups2=maxEvenIndex/2;
        long downs2=maxEvenIndex/2;
        long maxStrategy2=start+(ups2*maxDiff)-downs2;

        return Math.max(s,Math.max(maxStrategy1,maxStrategy2));
            
    }
}