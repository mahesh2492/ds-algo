package ds.list;

public class CircularLinkedList {

    static Node head;

    static class Node {
        private int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    public void display(Node head) {
        Node current = head.next;
        System.out.print(head.data + " ");
        while(current != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void insertAtEnd(int data) {
       Node newNode = new Node(data);
       Node current = head;

       if(current == null) {
           newNode.next = newNode;
           head = newNode;
           return;
       }

       while (current.next != head) {
           current = current.next;
       }
        newNode.next = head;
        current.next = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        newNode.next = head;
        while (current.next != head) {
            current = current.next;
        }

        current.next = newNode;
        head = newNode;
    }

    void deleteFromFront()  {
        Node current, temp = head;

        head = head.next;
        current = head;

        while(current.next != temp) {
            current = current.next;
        }

        current.next = head;
    }

    void deleteFromEnd()  {
        Node current = head;

        while(current.next.next != head) {
            current = current.next;
        }

        current.next = head;
    }

    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        System.out.println("Insertion at the beginning!!");
        cll.insertAtBeginning( 5);
        cll.insertAtBeginning( 4);
        cll.insertAtBeginning(3);
        cll.insertAtBeginning( 2);
        cll.insertAtBeginning( 1);

        cll.display(head);
        System.out.println("Insertion at the end!!");
        cll.insertAtEnd( 6);
        cll.insertAtEnd( 7);
        cll.insertAtEnd(8);
        cll.insertAtEnd( 9);
        cll.insertAtEnd( 10);

        cll.display(head);

        cll.deleteFromFront();
        cll.display(head);

        cll.deleteFromEnd();
        cll.display(head);
    }
}
