package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/submissions
 */
public class JumpingOnTheCloudsRevisited {

    static int jumpingOnClouds(int[] clouds, int k) {
        int energy = 100, i;

        int length = clouds.length;
        for (i = 0; i < length; i++) {
              if(i % k == 0) {
                  energy--;
                  if(clouds[i] == 1) {
                      energy -= 2;
                  }
              }
        }
        return energy;
    }

    public static void main(String[] args) {
      int t, n, k;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            int []arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(jumpingOnClouds(arr, k));
        }
    }
}
