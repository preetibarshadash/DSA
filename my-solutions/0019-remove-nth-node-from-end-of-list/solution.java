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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int nthNode = len - n;
        ListNode before = dummy;
        int i = 0;
        while (i < nthNode) {
            before = before.next;
            i++;
        }
        int j = nthNode;
        before.next = before.next.next;
        return dummy.next;
    }
}
