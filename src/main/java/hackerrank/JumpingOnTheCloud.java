package hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
public class JumpingOnTheCloud {

    static int jumpingOnClouds(int[] clouds) {
        int minSteps = 0, i = 0;
        for (i = 0; i < clouds.length - 2; ) {
            if (clouds[i + 1] == 1) {
                minSteps += 1;
                i = i + 2;
            } else if (clouds[i + 2] == 1) {
                minSteps += 1;
                i++;
            } else {
                minSteps += 1;
                i = i + 2;
            }
        }

        if (clouds.length - 1 != i) {
            minSteps++;
        }

        return minSteps;
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

            System.out.println(jumpingOnClouds(arr));
        }
    }
}
