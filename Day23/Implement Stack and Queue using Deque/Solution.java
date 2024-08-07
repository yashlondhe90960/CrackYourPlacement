class GFG {

   
    static class DQueNode {
        int value;
        DQueNode next;
        DQueNode prev;
    }

    
    static class deque {

        
        private DQueNode head;
        private DQueNode tail;

        
        public deque() {
            head = tail = null;
        }

        
        boolean isEmpty() {
            if (head == null)
                return true;

            return false;
        }

        
        int size() {

           
            if (!isEmpty()) {
                DQueNode temp = head;
                int len = 0;

                while (temp != null) {
                    len++;
                    temp = temp.next;
                }
                return len;
            }
            return 0;
        }

        
        void insert_first(int element) {

            
            DQueNode temp = new DQueNode();
            temp.value = element;

            
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                head.prev = temp;
                temp.next = head;
                temp.prev = null;
                head = temp;
            }
        }

        
        void insert_last(int element) {

            
            DQueNode temp = new DQueNode();
            temp.value = element;

            
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                tail.next = temp;
                temp.next = null;
                temp.prev = tail;
                tail = temp;
            }
        }

        
        public void remove_first() {
            // If list is not empty
            if (!isEmpty()) {
                // If there is only one node
                if (head == tail) {
                    head = tail = null;
                    return;
                } else {
                    head = head.next;
                    head.prev = null;
                }
            } else {
                System.out.println("List is Empty");
            }
        }

        
        void remove_last() {

            // If list is not empty
            if (!isEmpty()) {
                DQueNode temp = tail;
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
                return;
            }
            System.out.print("List is Empty");
        }

        
        void display() {

            // If list is not empty
            if (!isEmpty()) {
                DQueNode temp = head;

                while (temp != null) {
                    System.out.print(temp.value + " ");
                    temp = temp.next;
                }

                return;
            }
            System.out.print("List is Empty");
        }
    }

    // Class to implement stack using Deque
    static class Stack {
        deque d = new deque();

        
        public void push(int element) {
            d.insert_last(element);
        }

        // Returns size
        public int size() {
            return d.size();
        }

       
        public void pop() {
            d.remove_last();
        }

        // Display
        public void display() {
            d.display();
        }
    }

    
    static class Queue {
        deque d = new deque();

        
        public void enqueue(int element) {
            d.insert_last(element);
        }

        
        public void dequeue() {
            d.remove_first();
        }

        // display
        public void display() {
            d.display();
        }

        // size
        public int size() {
            return d.size();
        }
    }
}