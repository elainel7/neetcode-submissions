/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // copy all nodes, don't link
        // create a map of old node to new node
        // n time and n space
        Map<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null, null);
        Node cur = head;
        while (cur != null) {
            // clone the linked list nodes and add to hash map
            Node copy = new Node(cur.val);
            oldToCopy.put(cur, copy);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            // set the pointers
            Node copy = oldToCopy.get(cur);
            copy.next = oldToCopy.get(cur.next);
            copy.random = oldToCopy.get(cur.random);
            cur = cur.next;
        }

        return oldToCopy.get(head);
    }
}
