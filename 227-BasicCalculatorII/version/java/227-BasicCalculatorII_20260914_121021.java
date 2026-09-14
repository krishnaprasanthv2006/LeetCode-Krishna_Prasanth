// Last updated: 14/09/2026, 12:10:21
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int num = 0;
5        char sign = '+';
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9
10            if (Character.isDigit(c)) {
11                num = num * 10 + (c - '0');
12            }
13
14            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
15                if (sign == '+') {
16                    stack.push(num);
17                } else if (sign == '-') {
18                    stack.push(-num);
19                } else if (sign == '*') {
20                    stack.push(stack.pop() * num);
21                } else if (sign == '/') {
22                    stack.push(stack.pop() / num);
23                }
24
25                sign = c;
26                num = 0;
27            }
28        }
29
30        int result = 0;
31
32        while (!stack.isEmpty()) {
33            result += stack.pop();
34        }
35
36        return result;
37    }
38}