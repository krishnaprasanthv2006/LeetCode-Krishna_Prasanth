// Last updated: 11/08/2026, 14:17:35
class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[256];
        for(char ch : s.toCharArray())
        freq[ch]++;
        for(int i :s.toCharArray()){
        if (freq[i]==1)
        return  s.indexOf(i);
        }
        return -1;
    }
}