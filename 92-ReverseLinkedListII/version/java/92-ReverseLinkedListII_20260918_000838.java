// Last updated: 18/09/2026, 00:08:38
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        // Move prev to the node before 'left'
10        for (int i = 1; i < left; i++) {
11            prev = prev.next;
12        }
13
14        ListNode curr = prev.next;
15
16        // Reverse the required portion
17        for (int i = 0; i < right - left; i++) {
18
19            ListNode next = curr.next;
20
21            curr.next = next.next;
22            next.next = prev.next;
23            prev.next = next;
24        }
25
26        return dummy.next;
27    }
28}