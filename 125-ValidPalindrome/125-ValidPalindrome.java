// Last updated: 11/08/2026, 14:19:29
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase(); 
        s=s.replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
