package ds.stack;

import java.util.Stack;
public class AdjacentDuplicates {

    public static String removeAdjacentDuplicates(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(stack.isEmpty()) {
                    stack.push(c);
                } else {
                if(stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }

            }

        }

        while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicates("careermonk"));
        System.out.println(removeAdjacentDuplicates("mississippi"));
    }
}
