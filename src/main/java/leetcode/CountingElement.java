package leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/
 */
public class CountingElement {
    static public int countElements(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (search(arr, arr[i] + 1)) {
                count++;
            }
        }

        return count;
    }

    static public boolean search(int[] arr, int element) {
        boolean flag = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == element) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int t, size;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(countElements(arr));
        }
    }
}
