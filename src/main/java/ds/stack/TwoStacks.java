package ds.stack;

import java.util.Scanner;

public class TwoStacks {
    int size;
    int top1, top2;
    int []arr;

    TwoStacks(int size) {
        this.size = size;
        top1 = -1;
        top2 = size;
        arr = new int[size];
    }

    void push1(int x) {
        ++top1;
        if(top1 == size / 2) {
            System.out.println("First stack is full");
            return;
        }
        arr[top1] = x;
    }

    /* The method push to push element into the stack 2*/
    void push2(int x) {
        --top2;
        if(top2 == size / 2) {
            System.out.println("Second stack is full");
            return;
        }
        arr[top2] = x;
    }

    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1() {
        if(top1 == -1) {
            System.out.println("First Stack is empty.");
            return -1;
        }

        int popped = arr[top1];
        --top1;
        return popped;
    }

    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2()
    {
        if(top2 == size) {
            System.out.println("Second Stack is empty.");
            return -1;
        }

        int popped = arr[top2];
        ++top2;
        return popped;
    }

    public static void main(String[] args) {

        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }
}
