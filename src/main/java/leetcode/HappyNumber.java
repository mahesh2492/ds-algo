package leetcode;

import java.util.Scanner;

/*
https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/
 */
public class HappyNumber {

    static boolean search(int[] loop, int num) {
        for (int value : loop) {
            if (value == num) {
                return true;
            }
        }

        return false;
    }

    public static boolean isHappy(int n) {
        int[] loop = {4, 16, 37, 58, 89, 145, 42, 20};
        int s = 0;
        while (n > 0) {
            int remainder = n % 10;
            s += remainder * remainder;
            n = n / 10;
        }

        if (s == 1) {
            return true;
        } else {
            if (search(loop, s)) {
                return false;
            } else {
                return isHappy(s);
            }
        }
    }

    public static void main(String[] args) {
        int t, number;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            number = sc.nextInt();
            System.out.println(isHappy(number));
        }
    }
}
