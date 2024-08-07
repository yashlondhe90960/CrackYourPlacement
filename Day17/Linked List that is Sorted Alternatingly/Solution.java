class Solution {

    public Node sort(Node head) {
        // your code here, return the head of the sorted list
        Node head1 = new Node(0), head2 = new Node(0);
        Node temp1 = head1, temp2 = head2, temp = head;
        boolean indication = true;
        while (temp != null) {
            if (indication) {
                temp1.next = temp;
                temp1 = temp1.next;
            } else {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
            indication = !indication;
        }
        temp1.next = null;
        temp2.next = null;
        Node curr = head2, prev = null, nxt = head2.next;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        temp = prev;
        while (prev != null) {
            if (prev.next == head2) {
                prev.next = null;
            }
            prev = prev.next;
        }
        Node ans = new Node(0);
        head2 = ans;
        head1 = head1.next;
        while (head1 != null && temp != null) {
            if (head1.data <= temp.data) {
                ans.next = head1;
                head1 = head1.next;
            } else {
                ans.next = temp;
                temp = temp.next;
            }
            ans = ans.next;
        }
        while (head1 != null) {
            ans.next = head1;
            head1 = head1.next;
            ans = ans.next;
        }
        while (temp != null) {
            ans.next = temp;
            temp = temp.next;
            ans = ans.next;
        }
        return head2.next;
    }

}