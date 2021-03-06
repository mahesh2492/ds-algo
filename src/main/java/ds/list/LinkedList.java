package ds.list;

public class LinkedList {
    static Node head;

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
        int counter = 0;

        if (currentNode != null && counter == position) {
            head = head.next;
            return head;
        }

        while (currentNode != null && counter != position) {
            prev = currentNode;
            counter++;
            currentNode = currentNode.next;
        }

        if (currentNode == null) return head;

        prev.next = currentNode.next;

        return head;
    }

    Node delete(Node root, int postion) {
        if (postion == 1) {
            return root.next;
        } else {
            root.next = delete(root.next, postion - 1);
            return root;
        }
    }

    //using recursion
    Node deleteNode2(Node root, int position) {
        return delete(root, position);

    }

    public int nthElementFromEnd(int n) {
       Node current = head;
       int length = lengthOfList(head), counter = 1;
       assert length >= n;
       while(counter < (length - n + 1)) {
           ++counter;
           current = current.next;
       }

       return current.data;
    }

    public int lengthOfList(Node head) {
        Node current = head;
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }

        return len;
    }

    public int getNthFromEnd(int n) {
        Node nthNode = null, current = head;

        for(int i = 1 ; i < n; ++i) {
            if(current != null) {
                current = current.next;
            }
        }

       while (current != null) {
           if(nthNode == null) {
               nthNode = head;
           } else {
               nthNode = nthNode.next;
           }

           current = current.next;
       }

       assert nthNode != null;
       return nthNode.data;
    }

    //display elements using recursion
    public void displayRecur(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRecur(head.next);
    }

    //using iterative way
    public Node reverseList(Node head) {
        Node nextNode, prev = null;

        while (head != null) {
            nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    public Node recursiveReverse(Node current, Node prev) {
        if(current != null) {
            recursiveReverse(current.next, current);
            current.next = prev;
        } else {
            head = prev;
        }
        return head;
    }

    public Node insertInMid(Node head, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        int length = 0, counter = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;

        while ((temp != null) && (counter < Math.ceil(length >> 1))) {
            temp = temp.next;
            counter++;
        }

        assert temp != null;
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public Node oddEvenList(Node head) {
        Node odd = null, even = null, start = null, end = null, current = head ;

        int counter = 1;
        if(current == null || current.next == null) {
            return current;
        }

        while(current != null) {
            if(counter % 2 != 0) {
                if(odd == null) {
                    odd = current;
                    start = odd;
                }
                else {
                    odd.next = current;
                    odd = odd.next;
                }

            } else {
                if(even == null) {
                    even = current;
                    end = even;
                }
                else {
                    even.next = current;
                    even = even.next;
                }

            }

            current = current.next;
            counter = counter + 1;
        }

        assert even != null;
        even.next = null;
        odd.next = end;

        return start;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;

        ll.display(head);
        ll.displayRecur(head);
        ll.insertAtBeginning(0);
        System.out.println("List after adding element in beginning!");
        ll.display(head);
        System.out.println("List after adding element in beginning using recur!");
        ll.displayRecur(head);
        System.out.println();

        ll.insertAtEnd(5);
        System.out.println("List after adding element in end!");
        ll.displayRecur(head);

        System.out.println();
        ll.insertAfter(head.next.next.next, 4);
        System.out.println("List after adding element after given previous node!");
        ll.display(head);

        System.out.println("List after deleting given element!");
        ll.displayRecur(ll.deleteNode(head, 4));

        System.out.println();
        System.out.println(ll.lengthOfList(head));

        ll.display(ll.insertInMid(head, 12));

        ll.display(ll.oddEvenList(head));

        System.out.println("Reverse the given list");
        ll.displayRecur(ll.recursiveReverse(head, null));

        System.out.println();
        System.out.println(ll.nthElementFromEnd(1));
        System.out.println(ll.nthElementFromEnd(2));
        System.out.println(ll.getNthFromEnd(3));
        System.out.println(ll.getNthFromEnd(4));
    }

}
