// Last updated: 14/09/2026, 12:07:26
1class StockSpanner {
2    Stack<int[]> stack;
3
4    public StockSpanner() {
5        stack = new Stack<>();
6    }
7
8    public int next(int price) {
9        int span = 1;
10
11        while (!stack.isEmpty() && stack.peek()[0] <= price) {
12            span += stack.pop()[1];
13        }
14
15        stack.push(new int[]{price, span});
16        return span;
17    }
18}