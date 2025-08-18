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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode fixedNode = prev;
        ListNode end = curr;
        ListNode next = curr.next;
        for (int i = 0; curr != null && i <= right - left; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (fixedNode != null) {
            fixedNode.next = prev;
        } else {
            head = prev;
        }
        end.next = curr;
        return head;
    }
}
