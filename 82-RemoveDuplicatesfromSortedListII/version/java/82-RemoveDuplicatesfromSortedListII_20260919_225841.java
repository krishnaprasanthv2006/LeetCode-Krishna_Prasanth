// Last updated: 19/09/2026, 22:58:41
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0)
4            return head;
5        int n = 1;
6        ListNode tail = head;
7
8        while (tail.next != null) {
9            tail = tail.next;
10            n++;
11        }
12        k = k % n;
13
14        if (k == 0)
15            return head;
16        tail.next = head;
17
18        int steps = n - k;
19        ListNode newTail = head;
20
21        for (int i = 1; i < steps; i++) {
22            newTail = newTail.next;
23        }
24        ListNode newHead = newTail.next;
25        newTail.next = null;
26
27        return newHead;
28    }
29}