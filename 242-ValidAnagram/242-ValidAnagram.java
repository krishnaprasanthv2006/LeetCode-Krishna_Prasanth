// Last updated: 11/08/2026, 14:18:14
class Solution {
      public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int freq[] = new int[256];
        for(char x : s.toCharArray()) {
        	freq[x]++;
        }
        for(char x : t.toCharArray()) {
        	freq[x]--;
        	if(freq[x] < 0) return false;
        }
        return true;
    }
}