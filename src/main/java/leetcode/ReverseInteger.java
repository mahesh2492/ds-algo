package leetcode;

import static java.lang.StrictMath.pow;
/*
https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long sum = 0;

       if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
           return 0;
       }

        while(x != 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;

            x = x / 10;
        }

        if(sum >= Integer.MAX_VALUE || sum <= Integer.MIN_VALUE) {
            return 0;
        }

        return (int)sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
