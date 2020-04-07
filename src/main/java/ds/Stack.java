package ds;

public class Stack {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty(head)) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    boolean isEmpty(Node head) {
        return head == null;
    }

    void pop() throws Exception {
        if (isEmpty(head)) {
            throw new Exception("Stack is empty");
        }

        head = head.next;
    }

    void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public int getMax() {
        Node current = head;
        int max = 0;
        while (current != null) {
            if(max < current.data) {
                max = current.data;
            }

            current = current.next;
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display(head);
        stack.pop();
        System.out.println(stack.getMax());

    }
}
