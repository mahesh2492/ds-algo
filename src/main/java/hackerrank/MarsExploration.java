package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/mars-exploration/problem
 */
public class MarsExploration {
    static int marsExploration(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i = i + 3) {
           if(s.charAt(i) != 'S') {
               count++;
           }

           if(s.charAt(i + 1) != 'O') {
               count++;
           }

           if(s.charAt(i + 2) != 'S') {
               count++;
           }
       }

        return count;
    }

    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            input = sc.next();

            System.out.println(marsExploration(input));
        }
    }
}
