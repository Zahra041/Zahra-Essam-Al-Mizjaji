public class Main {
    public static void main(String[] args) {
        // Create a linked list with some elements
        Node head = new Node(16);
        Node node1 = new Node(23);
        Node node2 = new Node(25);
        Node node3 = new Node(30);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // a. Make A point to the node containing element 23.
        Node A = head;
        while (A != null && A.getElement() != 23) {
            A = A.getNext();
        }

        // b. Make list point to the node containing 16.
        Node list = head;
        while (list != null && list.getElement() != 16) {
            list = list.getNext();
        }

        // c. Make B point to the last node in the list.
        Node B = head;
        while (B != null && B.getNext() != null) {
            B = B.getNext();
        }

        // d. Make list point to an empty list.
        list = null;

        // e. Set the value of the node containing 25 to 35.
        Node node25 = head;
        while (node25 != null && node25.getElement() != 25) {
            node25 = node25.getNext();
        }
        if (node25 != null) {
            node25.setElement(35);
        }

        // f. Create and insert the node with element 10 after the node pointed by A.
        Node newNode = new Node(10);
        newNode.setNext(A.getNext());
        A.setNext(newNode);

        // g. Delete the node with element 23. Also, deallocate the memory occupied by this node.
        Node prev = null;
        Node curr = head;
        while (curr != null && curr.getElement() != 23) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            if (prev == null) {
                head = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
            curr.setNext(null);
        }

        // Print the final state of the linked list
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.getElement() + " ");
            currNode = currNode.getNext();
        }
    }
}

class Node {
    private int element;
    private Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}