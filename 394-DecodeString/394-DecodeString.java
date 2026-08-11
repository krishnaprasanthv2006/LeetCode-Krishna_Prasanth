// Last updated: 11/08/2026, 14:17:30
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr);

                num = 0;
                curr = "";
            }

            else if (ch == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                StringBuilder temp = new StringBuilder();

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = prev + temp.toString();
            }

            else {
                curr += ch;
            }
        }

        return curr;
    }
}