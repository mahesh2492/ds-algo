package ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {

    Stack<Long> stack ;
    private Long min;

    public MinStack() {
      stack = new Stack<Long>();
    }

    public void push(long x) {
        if(stack.isEmpty()) {
            min = x;
            stack.push(x);
            return;
        }
        if(x < min) {
            stack.push(2 * x - min);
            min = x;
        } else {
            stack.push(x);
        }
    }

    public void pop() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Long t = stack.pop();
        if(t < min) {
            min = 2 * min - t;
        }

     }

    public long top() {
        return stack.peek();
    }


    public long getMin() {
        return min;
    }

    public static void main(String[] args) {
      int t, query, data;
      MinStack minStack = new MinStack();
      Scanner sc = new Scanner(System.in);
      t = sc.nextInt();
      while (t-- > 0) {
         query = sc.nextInt();
         if(query == 1) {
             data = sc.nextInt();
             minStack.push(data);
         } else if(query == 2) {
             minStack.pop();
         } else if(query == 3) {
             System.out.println(minStack.top());
         } else if(query == 4) {
             System.out.println(minStack.getMin());
         } else {
             System.out.println("Wrong input");
         }
      }
    }
}
