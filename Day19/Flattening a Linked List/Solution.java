class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Traverse through the linked list
        while (root != null) {
            // Traverse through the child
            // nodes of each head node
            Node t2 = root;
            while (t2 != null) {
                // Store each node's data in the ArrayList
                arr.add(t2.data);
                // Move to the next child node
                t2 = t2.bottom;
            }
            // Move to the next head node
            root = root.next;
        }

        Collections.sort(arr);

        return convertArrToLinkedList(arr);
    }

    static Node convertArrToLinkedList(ArrayList<Integer> arr) {
        // Create a dummy node to serve as
        // the head of the linked list
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        
        for (int i = 0; i < arr.size(); i++) {
            
            temp.bottom = new Node(arr.get(i));
            
            temp = temp.bottom;
        }
        
        return dummyNode.bottom;
    }
}