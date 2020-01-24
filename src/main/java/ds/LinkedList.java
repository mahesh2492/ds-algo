package ds;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Should insert a node at the beginning
    void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // Should insert a node at the end
    void insertAtEnd(int x) {
        Node newNode = new Node(x);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        Node newNode = new Node(data);

        if (prevNode == null) {
            System.out.println("Previous Node cannot be null!");
            return;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        list.display(list.head);
        list.insertAtBeginning(0);
        System.out.println("List after adding element in beginning!");
        list.display(list.head);

        list.insertAtEnd(5);
        System.out.println("List after adding element in end!");
        list.display(list.head);

        list.insertAfter(list.head.next.next.next, 4);
        System.out.println("List after adding element after given previous node!");
        list.display(list.head);
    }

}
