package hackerearth.codemonk;

import java.util.Scanner;

/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/
 */
public class MonkWelcomeProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int[] a1, a2, a3;

        while (t-- > 0) {
            int n = sc.nextInt();
            a1 = new int[n];
            a2 = new int[n];
            a3 = new int[n];


            for (int i = 0; i < n; i++) {
                a1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                a2[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                a3[i] = a1[i] + a2[i];
                System.out.print(a3[i] + " ");
            }
            System.out.println();
        }
    }
}
