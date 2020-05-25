package leetcode;

import java.util.Arrays;
import java.util.Collections;

/*
https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3285/
 */
public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = 0;

        for (int num : nums) {
            maxEndingHere += num;

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}
