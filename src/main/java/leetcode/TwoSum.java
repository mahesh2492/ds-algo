package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*
https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0,j = 0;
        for(i = 0; i < nums.length; i++) {
            for(j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int t, size, target;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();
            target = sc.nextInt();
            int []arr = new int[size];

            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(twoSum(arr, target)));
        }
    }
}
