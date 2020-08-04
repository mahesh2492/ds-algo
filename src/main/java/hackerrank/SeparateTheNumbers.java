package hackerrank;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/separate-the-numbers/problem
 */
public class SeparateTheNumbers {

    static void separateNumbers(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            String subs = s.substring(0, i);
             long number = Long.parseLong(subs);

            String validString = Long.toString(number);
            while (validString.length() < s.length()) {
                validString += Long.toString(++number);
            }

            if (validString.equals(s)) {
                System.out.println("YES " + Long.parseLong(subs));
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String number = sc.next();
            separateNumbers(number);
        }
    }
}
