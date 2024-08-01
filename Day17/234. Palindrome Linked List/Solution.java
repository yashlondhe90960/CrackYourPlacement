class Solution {
    public boolean isPalindrome(ListNode head) {
        // 1. fid mid of LL
        // 2. reverse 2nd half of LL
        // 3. Compare 1st and 2nd half of LL
        // 4. re-reverse the 2nd half of LL

        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        // compate both halfs
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;

        }
        reverseList(rereverseHead);

        if (head == null || headSecond == null) {
            return true;
        }
        return false;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null) {
                next = next.next;
            }

        }
        return prev;

    }

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

        }
        return s;
    }
}