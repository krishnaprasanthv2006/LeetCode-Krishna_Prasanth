// Last updated: 19/09/2026, 22:56:21
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode prev = dummy;
17        ListNode curr = head;
18
19        while (curr != null) {
20            if (curr.next != null && curr.val == curr.next.val) {
21                int duplicate = curr.val;
22
23                while (curr != null && curr.val == duplicate) {
24                    curr = curr.next;
25                }
26
27                prev.next = curr;
28            } else {
29                prev = curr;
30                curr = curr.next;
31            }
32        }
33
34        return dummy.next;
35    }
36}