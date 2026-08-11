// Last updated: 11/08/2026, 14:13:40
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = getGCD(current.val, current.next.val);
            
            ListNode newNode = new ListNode(gcdValue);
            
            newNode.next = current.next;
            current.next = newNode;
            
            current = newNode.next;
        }

        return head;
    }
}
