package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?h_r=next-challenge&h_v=zen
 */
public class HackerRankInAString {
    static String hackerrankInString(String s) {
        int i, j;
        String hackerRank = "hackerrank";

        if(s.length() < hackerRank.length()) {
            return "NO";
        }

        for( i = 0; i < s.length() - 1; ) {
            for(j = 0; j < hackerRank.length() && i < s.length();) {
                if(s.charAt(i) == hackerRank.charAt(j)) {
                    ++i;
                    ++j;
                } else {
                    ++i;
                }
            }

            if(j == hackerRank.length()) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        int t;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            input = sc.next();

            System.out.println(hackerrankInString(input));
        }
      }
}
