package ds.stack;

import java.util.Scanner;
import java.util.Stack;

/*
Given an array of characters formed with a’s and b’s. The center is marked with ‘ X ‘. Check whether the string is palindrome or not?
 */
public class Palindrome {
    public static String isPalindrome(String input) {
        int i = 0;
        boolean flag = true;
        Stack<Character> stack = new Stack<>();

        for(; i < input.length(); ++i) {
            if (input.charAt(i) == 'X' || input.charAt(i) == 'x') {
                break;
            } else {
                stack.push(input.charAt(i));
            }
        }


        while(++i < input.length()) {
            if(input.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                flag = false;
                break;
            }
        }

        if(flag) {
            return "Palindrome";
        } else {
            return "Not Palindrome" ;
        }
    }
    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            input = sc.next();
            System.out.println(isPalindrome(input));
        }
    }
}
