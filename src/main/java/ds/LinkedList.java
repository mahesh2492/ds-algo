package ds;

import java.sql.SQLOutput;

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

    //delete node at given position
    Node deleteNode(Node head, int position) {
        Node currentNode = head, prev = null;
        int counter = 0 ;

        if(currentNode != null && counter == position) {
            head = head.next;
            return head;
        }

        while (currentNode != null && counter != position) {
            prev = currentNode;
            counter++;
            currentNode = currentNode.next;
        }

        if(currentNode == null) return head;

        prev.next = currentNode.next;

        return head;
    }

    Node delete(Node root , int postion) {
        if(postion == 1){
            return root.next ;
        } else {
            root.next = delete(root.next , postion-1);
            return  root;
        }
    }
    //using recursion
    Node deleteNode2(Node root , int position) {
        return delete(root,position);

    }

    public int getCount(Node head){
        Node current = head ;
        int len = 0;
        while(current != null) {
            len++;
            current = current.next;
        }

        return len;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;
        second.next = third;

        ll.display(ll.head);
        ll.insertAtBeginning(0);
        System.out.println("List after adding element in beginning!");
        ll.display(ll.head);

        ll.insertAtEnd(5);
        System.out.println("List after adding element in end!");
        ll.display(ll.head);

        ll.insertAfter(ll.head.next.next.next, 4);
        System.out.println("List after adding element after given previous node!");
        ll.display(ll.head);

      //  ll.deleteNode(ll.head, 0);
        System.out.println("List after deleting given element!");
        ll.display(ll.deleteNode(ll.head, 4));

        System.out.println(ll.getCount(ll.head));
    }

}
