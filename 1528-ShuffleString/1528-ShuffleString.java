// Last updated: 08/09/2026, 10:13:43
class Solution {
    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}