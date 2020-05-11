package hackerrank;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/game-of-stones-1/problem
 */
public class GameOfStones {
    static String gameOfStones(int n) {
       if(n % 7 == 0 || n % 7 == 1) {
           return "Second";
       } else {
           return "First";
       }
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(gameOfStones(n));
        }
    }
}
