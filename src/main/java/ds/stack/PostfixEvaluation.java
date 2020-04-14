package ds.stack;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == ' ') {
                continue;
            }

            if(Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
               int first = stack.pop();
               int second = stack.pop();

               switch(ch) {
                   case '+' :
                       stack.push(first + second);
                       break;
                   case '-':
                       stack.push(second - first);
                       break;
                   case '*':
                       stack.push(first * second);
                       break;
                   case '/':
                       stack.push(second / first);
                       break;
                   case '^':
                       stack.push(second ^ first);
                       break;
               }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) throws IOException {
        int t;
        String expr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            expr = br.readLine();
            System.out.println(evaluatePostfix(expr));
        }
    }
}
