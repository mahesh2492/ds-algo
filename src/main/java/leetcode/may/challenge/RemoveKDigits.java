package leetcode.may.challenge;

import java.util.Scanner;
import java.util.Stack;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/
 */
public class RemoveKDigits {
    public static String removeKDigits(String input, int k) {
        int i;
        Stack<Integer> stack = new Stack<>();
        stack.push(input.charAt(0) - '0');

        for(i = 1; i < input.length(); i++) {
            int element = input.charAt(i) - '0';

            while(k > 0 && !stack.isEmpty() && stack.peek() > element) {
                stack.pop();
                k -=1;
            }

            if(!stack.isEmpty() || element != 0) {
                stack.push(element);
            }
        }

        while (!stack.isEmpty() && k-- > 0) {
            stack.pop();
        }

        if(stack.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();

        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int t, k;
        String input;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            input = sc.next();
            k = sc.nextInt();
            System.out.println(removeKDigits(input, k));
        }
    }
}
