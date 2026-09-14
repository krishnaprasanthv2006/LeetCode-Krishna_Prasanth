// Last updated: 14/09/2026, 12:09:34
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (int a : asteroids) {
6            boolean alive = true;
7
8            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
9                if (stack.peek() < -a) {
10                    stack.pop();
11                } else if (stack.peek() == -a) {
12                    stack.pop();
13                    alive = false;
14                } else {
15                    alive = false;
16                }
17            }
18
19            if (alive) {
20                stack.push(a);
21            }
22        }
23
24        int[] result = new int[stack.size()];
25
26        for (int i = result.length - 1; i >= 0; i--) {
27            result[i] = stack.pop();
28        }
29
30        return result;
31    }
32}