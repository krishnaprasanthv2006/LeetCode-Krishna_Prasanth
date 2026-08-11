// Last updated: 11/08/2026, 14:15:38
class Solution {
    public int tribonacci(int n) {
      int i,n1=0,n2=1,n3=1,ans=0;
      int tri=0;
      if (n==0)
      return 0;
      if (n==1||n==2)   
      return 1;
      else{
        for(i=3;i<=n;i++){
            ans=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=ans;
        }
      }
      return ans;
}
}