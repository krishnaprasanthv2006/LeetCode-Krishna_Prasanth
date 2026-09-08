// Last updated: 08/09/2026, 10:14:47
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