// Last updated: 11/08/2026, 14:17:45
class Solution {
    public void reverseString(char[] s) {
        int i,st=0,se=s.length-1;
       while(st<se){
        char temp = s[st];
        s[st]=s[se];
        s[se]=temp;
        st++;
        se--;
       }
       for (i = 0;i<s.length-1;i++)
       System.out.print(s[i]);
        }
    }