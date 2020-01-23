package geeksforgeeks;

import java.util.Scanner;
import java.util.Stack;

/*
Problem: https://practice.geeksforgeeks.org/problems/special-stack/1
 */
public class SpecialStack {
    Stack<Integer> st = new Stack<>() ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        SpecialStack ss = new SpecialStack() ;

        while(t-- > 0) {
            int n = sc.nextInt();
            Stack<Integer> s = new Stack<>();
            while(!ss.isFull(s, n)) {
                ss.push(sc.nextInt(), s);
            }
            System.out.println(ss.min(s));
        }
    }

    public void push(int a,Stack<Integer> s) {
        if(st.isEmpty() || st.peek() > a )
            st.push(a) ;
        s.push(a);
    }

    public int pop(Stack<Integer> s) {
        return s.pop();
    }

    public int min(Stack<Integer> s) {
        return st.peek() ;
    }

    public boolean isFull(Stack<Integer>s, int n) {
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer>s) {
        return s.isEmpty();
    }

}
