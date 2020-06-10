package ds.queue;

import java.util.Stack;

public class QueueUsingTwoStack {

    private final Stack<Integer> first = new Stack<>();
    private final Stack<Integer> second = new Stack<>();

    void enqueue(int data) {
        first.push(data);
    }

    int dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty!! ");
            throw new RuntimeException("Queue is empty");
        } else {
            if (second.isEmpty()) {
                while (!first.isEmpty()) {
                    second.push(first.pop());
                }
            }

            return second.pop();
        }
    }

    int size() {
        return first.size() + second.size();
    }

    boolean isQueueEmpty() {
        return (first.isEmpty() && second.isEmpty());
    }

    public static void main(String[] args) {
        QueueUsingTwoStack queueUsingTwoStack = new QueueUsingTwoStack();

        queueUsingTwoStack.enqueue(1);
        queueUsingTwoStack.enqueue(2);
        queueUsingTwoStack.enqueue(3);

        System.out.println("Size of Queue: " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println(queueUsingTwoStack.dequeue());
    }
}
