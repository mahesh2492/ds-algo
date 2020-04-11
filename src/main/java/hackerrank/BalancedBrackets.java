package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/*
https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class BalancedBrackets {

    static String isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        if (input.length() == 1) {
            return "NO";
        }

        while (i <= input.length() - 1) {
            if (i == 0 && (input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}')) {
                return "NO";
            }

            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
                stack.push(input.charAt(i));
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    if (input.charAt(i) == ')') {
                        stack.pop();
                    } else {
                        break;
                    }
                } else if (!stack.isEmpty() && stack.peek() == '[') {
                    if (input.charAt(i) == ']') {
                        stack.pop();
                    } else {
                        break;
                    }
                } else {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        if (input.charAt(i) == '}') {
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                }
            }
            i++;
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            input = sc.next();

            System.out.println(isBalanced(input));
        }
    }
}
