package ds.stack;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> stack = new Stack<>();

    static void reverse(Stack<Integer> stack) {
        int data;
        if(stack.isEmpty()) {
            return;
        }

        data = stack.pop();
        reverse(stack);
        insertAtBottom(stack, data);
    }

    private static void insertAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse(stack);

        System.out.println(stack);
    }
}
