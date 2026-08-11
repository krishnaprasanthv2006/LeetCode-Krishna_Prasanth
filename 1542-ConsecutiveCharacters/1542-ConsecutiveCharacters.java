// Last updated: 11/08/2026, 14:15:02
class Solution {
    public int maxPower(String s) {

        int count = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}