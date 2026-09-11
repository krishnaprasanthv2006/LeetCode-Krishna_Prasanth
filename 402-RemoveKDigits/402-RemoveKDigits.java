// Last updated: 11/09/2026, 09:41:40
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder st = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (k > 0 && st.length() > 0 && st.charAt(st.length() - 1) > c) {
                st.deleteCharAt(st.length() - 1);
                k--;
            }
            st.append(c);
        }

        while (k > 0) {
            st.deleteCharAt(st.length() - 1);
            k--;
        }

        int i = 0;
        while (i < st.length() && st.charAt(i) == '0') {
            i++;
        }

        String ans = st.substring(i);

        return ans.length() == 0 ? "0" : ans;
    }
}