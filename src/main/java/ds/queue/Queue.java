package ds.queue;

public class Queue {

    static Node head, rear;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if(head == null) {
           head = newNode;
           return;
       }

       Node current = head;

       while (current.next != null) {
           current = current.next;
       }
        rear = newNode;
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

    void dequeue() {
      if(head == null) {
          throw new RuntimeException("Queue is empty!!");
      }

      if(head.next == null) {
          head = null;
          rear = null;
      } else {
          head = head.next;
      }

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

    void reverseQueue() {
        if (head != null) {
            int front = front();
            dequeue();
            reverseQueue();
            enqueue(front);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("is Queue empty?: "+ queue.isEmptyQueue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.display();
        queue.reverseQueue();
        queue.display();

        System.out.println("Queue Front " + queue.front() + " Rear " + rear.data);
        queue.display();

        queue.dequeue();
        queue.display();
        System.out.println("Queue size " + queue.queueSize());
        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("is Queue Empty again?: " + queue.isEmptyQueue());
    }
}
