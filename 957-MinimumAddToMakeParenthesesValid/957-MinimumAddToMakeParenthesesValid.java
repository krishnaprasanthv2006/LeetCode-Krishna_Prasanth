// Last updated: 11/08/2026, 14:16:02
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    count++;
                }
            }
        }

        return count + open;
    }
}