// Last updated: 11/08/2026, 14:13:57
class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int zero = 0;
        int one = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '0') {

                if (i > 0 && s.charAt(i - 1) == '1') {
                    zero = 0;
                    one = 0;
                }

                zero++;

            } else {

                one++;
                ans = Math.max(ans, 2 * Math.min(zero, one));
            }
        }

        return ans;
    }
}