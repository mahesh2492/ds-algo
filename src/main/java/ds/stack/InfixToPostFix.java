package ds.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

    static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            } else {
                if (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek()) && stack.peek() != '(') {
                    while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(ch)) {
                        if (stack.peek() == ')') {
                            stack.pop();
                            break;
                        } else {
                            sb.append(stack.peek());
                            stack.pop();
                        }
                    }
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        int t;
        String expr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            expr = br.readLine();
            System.out.println(infixToPostfix(expr));
        }
    }
}
