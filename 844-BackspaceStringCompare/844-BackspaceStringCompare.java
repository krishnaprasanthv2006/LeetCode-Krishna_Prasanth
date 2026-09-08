// Last updated: 08/09/2026, 10:15:02
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