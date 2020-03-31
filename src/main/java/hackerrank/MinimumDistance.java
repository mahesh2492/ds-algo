package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/minimum-distances/problem
 */
public class MinimumDistance {
    static int minimumDistances(int[] a) {
        int min = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (a[i] == a[j]) {
                        if (j - i < min) {
                            min = j - i;
                        }
                    }
                }
            }
        }

        if (min == a.length) {
            return -1;
        } else {
            return min;
        }
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(minimumDistances(arr));
        }
    }
}
