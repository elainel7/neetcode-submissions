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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy head
        ListNode curr = dummy; // set pointer to the dummy
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) { // using or because we want to have all digits/carries of each list used up
            int sum = carry;
            int keep = sum % 10; // 8
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; 
            } 
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // now we have the digits of l1 and l2 added to the carry,
            // let's say it's 8 + 9 = 17, stored in an int
            carry = sum / 10; // 1
            curr.next = new ListNode (sum % 10); // 7
            curr = curr.next;
        }
        return dummy.next; // return the next, not the dummy that starts at 0
    }
}
