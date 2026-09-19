// Last updated: 19/09/2026, 23:00:00
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13
14        if (head == null || head.next == null)
15            return;
16
17        // Find middle
18        ListNode slow = head;
19        ListNode fast = head;
20
21        while (fast != null && fast.next != null) {
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        // Reverse second half
27        ListNode second = slow.next;
28        slow.next = null;
29
30        ListNode prev = null;
31
32        while (second != null) {
33            ListNode next = second.next;
34            second.next = prev;
35            prev = second;
36            second = next;
37        }
38
39        // Merge two halves
40        ListNode first = head;
41        second = prev;
42
43        while (second != null) {
44            ListNode firstNext = first.next;
45            ListNode secondNext = second.next;
46
47            first.next = second;
48            second.next = firstNext;
49
50            first = firstNext;
51            second = secondNext;
52        }
53    }
54}