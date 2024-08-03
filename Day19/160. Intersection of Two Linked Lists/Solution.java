public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        // HashMap<ListNode,Integer> map = new HashMap<>();
        // ListNode temp = headA;
        // while(temp != null){
        // map.put(temp, 1);
        // temp = temp.next;
        // }

        // temp = headB;

        // while(temp != null){
        // if(map.containsKey(temp)) return temp;
        // temp = temp.next;
        // }
        // return null;

        // ListNode temp1 = headA;
        // ListNode temp2 = headB;
        // int count1 = 0;
        // int count2 = 0;
        // // count total number of element in headA
        // while(temp1 != null) {
        // count1++;
        // temp1 = temp1.next;
        // }
        // // count total number of element in headB
        // while(temp2 != null) {
        // count2++;
        // temp2 = temp2.next;
        // }
        // temp1 = headA;
        // temp2 = headB;
        // if(count1 > count2) { // if headA have more number of element move headA
        // int move = count1 - count2;
        // while(move > 0) {
        // temp1 = temp1.next;
        // move--;
        // }
        // }
        // else { // else headB have more number of element move headB
        // int move = count2 - count1;
        // while(move > 0) {
        // temp2 = temp2.next;
        // move--;
        // }
        // }
        // // now bith temp1 and temp2 have same number of element from where ther are
        // pointing
        // while(temp1 != null) { // can also take temp2
        // if(temp1 == temp2) return temp1; // if intersection found
        // temp1 = temp1.next;
        // temp2 = temp2.next;
        // }
        // // if no intersection return null
        // return null;

        // optimal
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? head2 : temp1.next;

            temp2 = (temp2 == null) ? head1 : temp2.next;

        }
        return temp1;

    }

}