package leetcode.may.challenge;

import java.util.Scanner;

// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num < 0) return false;
        if(num <= 1) return true;

        long low = 2;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if(mid * mid < num) {
                low = mid + 1;
            } else if(mid * mid > num){
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int t, num;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while(t-- > 0) {
            num = sc.nextInt();
            System.out.println(isPerfectSquare(num));
        }
    }
}

