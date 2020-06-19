package ds.queue;

import java.util.Stack;
/*
https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 */
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

    int front() {
        if (second.isEmpty()) {
            while (!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStack queueUsingTwoStack = new QueueUsingTwoStack();

        queueUsingTwoStack.enqueue(76);
        queueUsingTwoStack.enqueue(33);
        System.out.println("Dequeue: " + queueUsingTwoStack.dequeue());
        queueUsingTwoStack.enqueue(23);
        queueUsingTwoStack.enqueue(97);
        queueUsingTwoStack.enqueue(21);
        System.out.println("Front: " + queueUsingTwoStack.front());
        System.out.println("Queue " + queueUsingTwoStack.first);

        System.out.println("Front: " + queueUsingTwoStack.front());
        queueUsingTwoStack.enqueue(74);

    }
}
