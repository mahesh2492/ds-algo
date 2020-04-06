package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/
 */
public class HappyNumber {

    public static int findSquareOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder * remainder;
            num = num / 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> isVisited = new HashSet<>();

        for (int i = 1; i < 810; i++) {
            if (n == 1) {
                return true;
            }

            n = findSquareOfDigits(n);
            if (isVisited.contains(n)) {
                return false;
            }
            isVisited.add(n);
        }
        return false;
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
