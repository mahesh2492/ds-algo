package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/strong-password/problem
 */
public class StrongPassword {
    static int minimumNumber(int n, String password) {
        int lower = 0, upper = 0, digit = 0, special = 0;

        for(int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if(c >= 48 && c <= 57) {
                 ++digit;
            } else if(c >= 65 && c <= 90) {
               ++upper;
            } else if(c >= 97 && c <= 122) {
               ++lower;
            } else {
               ++special;
            }
        }

        int min = 0;
        if(lower == 0) {
            min += 1;
        }

        if(upper == 0) {
            min += 1;
        }
        if(digit == 0) {
            min += 1;
        }

        if(special == 0) {
            min +=1;
        }

        return Integer.max(min, 6 - n);
    }

    public static void main(String[] args) {
        int t;
        String password;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            password = sc.next();
            System.out.println(minimumNumber(password.length(), password));
        }
    }
}
