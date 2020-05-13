package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

/*
https://www.hackerrank.com/challenges/marcs-cakewalk/problem
 */
public class MarcsCakeWalk {
    static long marcsCakewalk(int[] calorie) {
       int i, j = 0;
        Arrays.sort(calorie);
        long sum = 0;
        for(i = calorie.length -1; i >= 0; i--) {
            sum += pow(2, j++) * calorie[i];
        }
       return sum;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int []calorie = new int[n];

            for(int i = 0; i < n; i++) {
                calorie[i] = sc.nextInt();
            }

            System.out.println(marcsCakewalk(calorie));
        }
    }
}
