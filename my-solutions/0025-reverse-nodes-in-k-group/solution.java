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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode newHead = null;
        ListNode tail = null;

        while (current != null) {
            // check if at least k nodes remain
            ListNode check = current;
            int cnt = 0;
            while (cnt < k && check != null) {
                check = check.next;
                cnt++;
            }
            if (cnt < k) {  // not enough nodes, just attach remaining
                if (tail != null) {
                    tail.next = current;
                } else {
                    newHead = head;
                }
                break;
            }

            // reverse exactly k nodes
            ListNode grpHead = current;
            ListNode prev = null;
            ListNode next = null;
            int count = 0;

            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            // connect reversed part
            if (newHead == null) {
                newHead = prev;
            }
            if (tail != null) {
                tail.next = prev;
            }

            tail = grpHead;
        }

        return newHead;
    }
}

