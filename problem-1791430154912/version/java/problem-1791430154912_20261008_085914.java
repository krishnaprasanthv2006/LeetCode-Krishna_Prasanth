// Last updated: 08/10/2026, 08:59:14
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4        int left = 0;
5        int right = arr.length - 1;
6
7        while (left < right) {
8            while (left < right && !Character.isLetter(arr[left])) {
9                left++;
10            }
11
12            while (left < right && !Character.isLetter(arr[right])) {
13                right--;
14            }
15
16            char temp = arr[left];
17            arr[left] = arr[right];
18            arr[right] = temp;
19
20            left++;
21            right--;
22        }
23
24        return new String(arr);
25    }
26}