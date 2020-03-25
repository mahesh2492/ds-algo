package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

/*
https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);

        int maxHeight = height[height.length - 1];

        if (maxHeight < k) {
            return 0;
        } else {
            return abs(maxHeight - k);
        }
    }

    public static void main(String[] args) {
        int t, k, n;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while(t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            int []arr = new int[n];

            for(int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
            }

            System.out.println(hurdleRace(k, arr));
        }

    }
}
