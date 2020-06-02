package ds;

public class Queue {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
           head = newNode;
           return;
       }

       Node current = head;

       while (current.next != null) {
           current = current.next;
       }

       current.next = newNode;
    }

    void display() {
      Node current = head;

      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
        System.out.println();
    }

    void delete() {
      head = head.next;
    }

    int front() {
        return head.data;
    }

    int queueSize() {
      Node current = head;
      int len = 0;
      while (current != null) {
          len++;
          current = current.next;
      }

      return len;
    }

    boolean isEmptyQueue() {
        return head == null;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("is Queue empty?: "+ queue.isEmptyQueue());
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        System.out.println("Queue Front " + queue.front());
        queue.display();

        queue.delete();
        queue.display();
        System.out.println("Queue size " + queue.queueSize());
        queue.delete();
        queue.display();


    }
}
