public class Solution {
    public boolean hasCycle(ListNode head) {
        // brute HashTable
        // HashSet<ListNode> st = new HashSet<>();
        // while(head!=null){
        // if(st.contains(head)) return true;
        // st.add(head);
        // head = head.next;
        // }

        // return false;
        if (head == null)
            return false;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;

        // ListNode f = head;
        // ListNode s = head;

        // while (f != null && f.next != null) {
        // f = f.next.next; /// 2 times
        // s = s.next; // 1 time

        // if (f == s) {
        // return true; // there exists a cycle
        // }

        // }
        // return false;
    }
}