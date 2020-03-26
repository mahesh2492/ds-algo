package hackerrank;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDay {
    static int reverse(int number) {
        int div = 10, rev = 0;
        while (number > 0) {
            rev = rev * div + number % 10;
            number = number / 10;
        }

        return rev;
    }

    static int beautifulDays(int i, int j, int k) {
        int days = 0;

        for (int m = i; m <= j; ++m) {
            if (abs(m - reverse(m)) % k == 0) {
                ++days;
            }
        }

        return days;
    }

    public static void main(String[] args) {
        int t, first, second, divisor;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            first = sc.nextInt();
            second = sc.nextInt();
            divisor = sc.nextInt();
            System.out.println(beautifulDays(first, second, divisor));
        }
    }
}

