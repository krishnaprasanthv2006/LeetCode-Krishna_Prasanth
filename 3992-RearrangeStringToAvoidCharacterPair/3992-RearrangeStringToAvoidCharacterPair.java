// Last updated: 08/09/2026, 10:12:02
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int []count = new int [256];
        for (int i =0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            if(ch!= x && ch!=y){
                while (count[i]>0){
                    sb.append(ch);
                    count[i]--;
                }
            }
        }
        while(count[y-'a']>0){
            sb.append(y);
            count[y-'a']--;
        }
        while(count[x - 'a']>0){
             sb.append(x);
            count[x-'a']--;
        }
        return sb.toString();
    }
}