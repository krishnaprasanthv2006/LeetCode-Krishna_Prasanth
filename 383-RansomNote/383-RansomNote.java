// Last updated: 11/08/2026, 14:17:37
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[256];

        for(char i :magazine.toCharArray())
        freq[i]++;

        for(char i :ransomNote.toCharArray())
        freq[i]--;

    for(int i =0;i<freq.length-1;i++){
        if (freq[i]<0)
        return false; 
    }
    return true;
    }
}