// Last updated: 19/09/2026, 23:02:28
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3
4        ListNode slow = head;
5        ListNode fast = head;
6
7        while (fast != null && fast.next != null) {
8            slow = slow.next;
9            fast = fast.next.next;
10
11            if (slow == fast) {
12                break;
13            }
14        }
15
16        if (fast == null || fast.next == null) {
17            return null;
18        }
19
20        slow = head;
21
22        while (slow != fast) {
23            slow = slow.next;
24            fast = fast.next;
25        }
26
27        return slow;
28    }
29}