class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i < n; i++) {
            second = second.next;
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;

        }
        first.next = first.next.next;

        return dummy.next;

        // if(head == null) return null;

        // int cnt = 0;
        // ListNode temp = head;

        // while(temp != null){
        // cnt++;
        // temp = temp.next;

        // }
        // if(cnt == n){
        // ListNode newHead = head.next;
        // head = null;
        // return newHead;
        // }

        // int res = cnt - n;
        // temp = head;

        // while(temp != null){
        // res--;
        // if(res == 0) break;

        // temp = temp.next;

        // }
        // ListNode delNode = temp.next;
        // temp.next = temp.next.next;
        // delNode = null;
        // return head;

    }
}