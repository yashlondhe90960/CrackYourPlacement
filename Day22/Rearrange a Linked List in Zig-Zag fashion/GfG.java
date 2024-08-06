public class GfG {

    static Node head = null;
    static int temp = 0;

    static void zigZagList(Node head) {
        boolean flag = true;

       
        Node current = head;
        while (current != null && current.next != null) {
            if (flag == true) 
            {
                
                if (current.data > current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            } else 
            {
               
                if (current.data < current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }

            current = current.next;

           
            flag = !(flag);
        }
    }

    {

    }
}
