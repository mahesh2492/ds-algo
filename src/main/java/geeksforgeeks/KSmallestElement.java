package geeksforgeeks;

import java.util.Scanner;

/*
Problem: https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
 */
public class KSmallestElement {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] p, q;

        int n1 = m - l + 1;
        int n2 = r - m;

        p = new int[n1];
        q = new int[n2];

        System.arraycopy(arr, l, p, 0, n1);

        for (int j = 0; j < n2; j++) {
            q[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (p[i] <= q[j]) {
                arr[k] = p[i];
                i++;
            } else {
                arr[k] = q[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = p[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = q[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, k;
        t = sc.nextInt();
        int[] arr;

        while (t-- > 0) {
            int n = sc.nextInt();
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            k = sc.nextInt();
            mergeSort(arr, 0, n - 1);
            System.out.println(arr[k - 1]);
        }
    }
}
