package ds.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

    private final Queue<Integer> first = new LinkedList<>();
    private final Queue<Integer> second = new LinkedList<>();

    void enqueue(int data) {
        if(first.isEmpty()) {
            first.add(data);
        } else {
            while (!first.isEmpty()) {
                second.add(first.remove());
            }

            first.add(data);
            while (!second.isEmpty()) {
                first.add(second.remove());
            }
        }
    }

    int dequeue() {
       if(!first.isEmpty()) {
           return first.remove();
       } else {
           System.out.println("Stack is empty!");
           throw new RuntimeException("Stack is empty!");
       }
    }

    void display() {
        System.out.println(first);
    }
    public static void main(String[] args) {

        StackUsingTwoQueue stackUsingTwoQueue = new StackUsingTwoQueue();

        stackUsingTwoQueue.enqueue(1);
        stackUsingTwoQueue.enqueue(5);
        stackUsingTwoQueue.enqueue(3);

        stackUsingTwoQueue.display();

        System.out.println(stackUsingTwoQueue.dequeue());
        stackUsingTwoQueue.enqueue(4);
        System.out.println(stackUsingTwoQueue.dequeue());
        stackUsingTwoQueue.display();

    }
}
