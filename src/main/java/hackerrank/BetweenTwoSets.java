package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/between-two-sets/problem
 */

public class BetweenTwoSets {

    public static int lcm(int a, int b) {
        return (a * b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int getTotalX(int[] a, int[] b) {
       int multiple = 0;
       for(int i: b) {
           multiple = gcd(multiple, i);
       }

       int factor = 1;
       for(int i: a) {
           factor = lcm(factor, i);
           if(factor > multiple) {
               return 0;
           }
       }

       if(multiple % factor != 0) {
           return 0;
       }

        int totalX = 1;

        for (int i = factor; i < multiple; i++) {
            if (multiple % i == 0 && i % factor == 0) {
                totalX++;
            }
        }

        return totalX;
    }
        public static void main(String[] args) {
        int t, size1, size2;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t -- > 0) {
            size1 = sc.nextInt();
            size2 = sc.nextInt();

            int []arr = new int[size1];

            int []arr2 = new int[size2];

            for(int i = 0; i < size1; i++) {
               arr[i] = sc.nextInt();
            }

            for(int i = 0; i < size2; i++) {
               arr2[i] = sc.nextInt();
            }

            System.out.println(getTotalX(arr, arr2));
        }

    }
}
