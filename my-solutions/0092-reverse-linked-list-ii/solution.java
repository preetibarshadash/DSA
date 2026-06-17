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
        if (head == null || left == right)
            return head;
        int times = right - left + 1;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode beforeLeftNode = dummyHead;
        int pos = 1;
        ListNode leftNode = head;
        while (pos < left) {
            beforeLeftNode = leftNode;
            leftNode = leftNode.next;
            pos++;
        }
        //reverse sub-list
        ListNode current = leftNode, prev = null;
        while (times > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            times--;
        }
        beforeLeftNode.next = prev;
        leftNode.next = current;
        return dummyHead.next;
    }
}
