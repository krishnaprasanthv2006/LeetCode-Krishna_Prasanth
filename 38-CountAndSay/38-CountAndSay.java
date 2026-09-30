// Last updated: 30/09/2026, 09:22:39
class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();

            int count = 1;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    next.append(count);
                    next.append(s.charAt(j - 1));
                    count = 1;
                }
            }

            next.append(count);
            next.append(s.charAt(s.length() - 1));

            s = next.toString();
        }

        return s;
    }
}