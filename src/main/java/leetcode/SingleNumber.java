package leetcode;

import java.util.Scanner;

/*
https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3283/

 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int number = nums[0];
        for(int i = 1; i < nums.length; i++ ) {
            number = number ^ nums[i];
        }
        return number;
    }

    public static void main(String[] args) {
        int t, number;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            number = sc.nextInt();
            int []numbers = new int[number];
            for(int i = 0; i < number; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.println(singleNumber(numbers));
        }
    }
}
