package hackerrank;

import java.util.Scanner;

import static java.lang.Math.floor;

/*
https://www.hackerrank.com/challenges/strange-advertising/problem
 */
public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int days = 2, share = 5, likes = 2, cumulative = 2;
        while(days <= n) {
           share = likes * 3;
           likes = (int) floor(share / 2);
           cumulative += likes;
           ++days;
        }

      return cumulative;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(viralAdvertising(n));
        }
    }
}
