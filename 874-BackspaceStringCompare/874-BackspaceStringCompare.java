// Last updated: 11/08/2026, 14:16:13
import java.util.Stack;

class Solution {

    public String build(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}