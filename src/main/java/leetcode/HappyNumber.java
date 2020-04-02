package leetcode;

import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int s = 0;
        while (n > 0) {
            int remainder = n % 10;
            s += remainder * remainder;
            n = n / 10;
        }

        if (s == 1) {
            return true;
        } else {
            return isHappy(s);
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
