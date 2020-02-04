package hackerearth.array;

import java.util.Scanner;

/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
 */
public class MicroArrayUpdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, k, n;
        t = sc.nextInt();
        long[] arr;

        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new long[n];

            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            if (min > k)
                System.out.println(0);
            else
                System.out.println(k - min);
        }
    }

}
