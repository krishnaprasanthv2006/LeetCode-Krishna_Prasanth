// Last updated: 19/09/2026, 22:56:57
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode before = new ListNode(0);
4        ListNode after = new ListNode(0);
5
6        ListNode b = before;
7        ListNode a = after;
8
9        while (head != null) {
10            if (head.val < x) {
11                b.next = head;
12                b = b.next;
13            } else {
14                a.next = head;
15                a = a.next;
16            }
17
18            head = head.next;
19        }
20
21        a.next = null;
22        b.next = after.next;
23
24        return before.next;
25    }
26}