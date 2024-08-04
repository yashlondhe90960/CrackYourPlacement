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
        Node curr = head;
        if (head == null)
            return null;
        // step 1
        while (curr != null) {
            Node temp = new Node(curr.val, null, null);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;

        }

        // step 2
        Node ans = head.next;
        Node temp = ans;
        curr = head;
        while (temp != null) {
            Node x = curr.random;
            if (x == null)
                temp.random = null;
            else
                temp.random = x.next;
            curr = curr.next.next;
            if (temp.next == null)
                break;
            temp = temp.next.next;

        }

        // step 3
        temp = ans;
        curr = head;
        while (temp != null) {
            curr.next = temp.next;
            curr = curr.next;
            if (temp.next == null)
                break;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return ans;

    }
}