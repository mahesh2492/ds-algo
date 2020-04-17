package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 */
public class SherlockAndSquare {
    static int squares(int a, int b) {
        int count = 0;
       for(int i = 1; i * i <= b; i++) {
           if(i * i >= a && i * i <= b) {
               count++;
           }
       }
       return count;
    }
   //1 4, 9, 16, 25, 36, 49, 64, 81, 100 121 144 169 196

    public static void main(String[] args) {
        int t, first, second;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            first = sc.nextInt();
            second = sc.nextInt();
            System.out.println(squares(first, second));
        }
    }
}
