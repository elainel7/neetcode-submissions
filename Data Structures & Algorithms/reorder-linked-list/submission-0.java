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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = reverse(slow.next);
        slow.next = null;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }



        // logic is not great for these
        // ListNode mid = slow; // pointer to the middle of the list
        // // now, reverse everything after slow
        // mid = reverse(mid.next);
        // slow.next = null; 
        // combine(slow, mid);
        

    }

    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverse(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
    }

    // logic is broken for theses
    // public ListNode combine(ListNode list1, ListNode list2) { 
    //     if (list1 == null) return list2;
    //     list1.next = combine(list1.next, list2);
    //     list2.next = combine(list1, list2.next);  
    //     return list1;    
    // }


}
