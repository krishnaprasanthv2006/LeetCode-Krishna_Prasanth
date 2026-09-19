// Last updated: 19/09/2026, 23:01:19
1class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null)
4            return null;
5        Node curr = head;
6
7        while (curr != null) {
8            Node copy = new Node(curr.val);
9            copy.next = curr.next;
10            curr.next = copy;
11            curr = copy.next;
12        }
13
14        curr = head;
15
16        while (curr != null) {
17            if (curr.random != null) {
18                curr.next.random = curr.random.next;
19            }
20
21            curr = curr.next.next;
22        }
23
24        curr = head;
25        Node copyHead = head.next;
26
27        while (curr != null) {
28            Node copy = curr.next;
29
30            curr.next = copy.next;
31
32            if (copy.next != null) {
33                copy.next = copy.next.next;
34            }
35
36            curr = curr.next;
37        }
38
39        return copyHead;
40    }
41}