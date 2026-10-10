// Last updated: 10/10/2026, 09:20:32
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder sb = new StringBuilder();
4
5        int i = num1.length() - 1;
6        int j = num2.length() - 1;
7        int carry = 0;
8
9        while (i >= 0 || j >= 0 || carry > 0) {
10            int sum = carry;
11
12            if (i >= 0)
13                sum += num1.charAt(i--) - '0';
14
15            if (j >= 0)
16                sum += num2.charAt(j--) - '0';
17
18            sb.append(sum % 10);
19            carry = sum / 10;
20        }
21
22        return sb.reverse().toString();
23    }
24}