class Solution {

    Node compute(Node head) {
        

        Node cur = head;
        Node prev = null;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;

        

        Node current = head;

        Node maxNode = head;
        Node temp;

        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                temp = current.next;
                current.next = temp.next;

            } else {
                current = current.next;
                maxNode = current;
            }
        }

        // reversing list again to get required result :-

        cur = head;
        prev = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;

        // head of list can be returned now

        return head;

    }

}