package ds;

public class DoublyLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int x) {
        Node newNode = new Node(x);
        Node temp = head;

        if (temp == null) {
            insertAtBeginning(x);
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void displayRev(Node head) {
        if (head.next != null) {
            displayRev(head.next);
        }

        System.out.print(head.data + " ");
    }

    int length(Node head) {
        int counter = 0;
        while(head != null) {
            counter++;
            head = head.next;
        }

        return counter;
    }

    void insertAtPos(int pos, int data) {
        Node first = head;
        Node newNode = new Node(data);
        int counter = 1;

        if(pos < 1 || pos > length(first)) {
            throw new IllegalArgumentException("Position must be greater than 0 or must be less or equal to " + length(first));
        }

        if (first == null) {
            insertAtBeginning(data);
            return;
        }

        if (counter == pos) {
            newNode.next = first;
            first.prev = newNode;
            head = newNode;
            return;
        }

        while (first.next != null && counter != pos) {
            counter++;
            first = first.next;
        }

        if (first.next == null) {
            first.next = newNode;
            newNode.prev = first;
            return;
        }

        first.prev.next = newNode;
        newNode.prev = first.prev;
        newNode.next = first;
        first.prev = newNode;

    }

    Node delete(Node head, int position) {
        Node current = head;
        int counter = 1;

        if(position < 1 || position > length(current)) {
            throw new IllegalArgumentException("Can't delete as position must be greater than 0 or must be less or equal to " + length(current));
        }

        if (current != null && counter == position) {
            head = head.next;
            return head;
        }

        while (current != null && counter != position) {
            counter++;
            current = current.next;
        }

        if (current == null) return head;

        current.next.prev = current.prev;
        current.prev.next = current.next;

        return head;
    }

    Node deleteRecursive(Node head, int pos, int counter) {
        if (counter == pos) {
            return head.next;
        } else {
            Node current = deleteRecursive(head.next, pos, counter + 1);
            head.next = current;
            current.prev = head;
        }
        return head;
    }

    void deleteRecur(int pos) {
        if(pos == 0) {
            head = head.next;
            head.prev = null;
        } else {
            head = deleteRecursive(head , pos, 0) ;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("List after insertions at beginning");
        dll.insertAtBeginning(6);
        dll.insertAtBeginning(4);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(1);
        dll.display(head);

        System.out.println("List after insertions at end");
        dll.insertAtEnd(7);
        dll.insertAtEnd(8);
        dll.display(head);

        System.out.println("List after insertions at given pos");
        dll.insertAtPos(5, 5);
        dll.display(head);
        dll.insertAtPos(8, 8);
        dll.display(head);


        System.out.println("List after deletion");
        dll.delete(head,15);
        dll.display(head);
    }
}
