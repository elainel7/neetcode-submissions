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
        if (head == null ) return null;

        ListNode newHead = new ListNode(0, head); // need this in case we only have 1 item
        ListNode first = newHead;
        ListNode second = newHead;

        int track = n + 1; // need to move it ahead by 1 since we start at newHead
        while (track != 0) {
            first = first.next;
            track--;
        }

        while (first != null) {
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;

        return newHead.next;
    }
}
