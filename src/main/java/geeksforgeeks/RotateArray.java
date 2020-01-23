package geeksforgeeks;

import java.util.Scanner;

/*
Problem: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
 */
public class RotateArray {
    public static void main(String[] args) {
        int t, n, offset;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            offset = sc.nextInt();
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            RotateArray.rotateArray(arr, n, offset);
        }
    }

    public static void rotateArray(int[] arr, int n, int offset) {
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0; i < n; i++) {
            sb.append(arr[(i + offset) % n]) ;
            sb.append(' ');
        }

        System.out.println(sb);
    }
}
