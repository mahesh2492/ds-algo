package hackerrank;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetite {

    static void bonAppetit(int[] bill, int k, int b) {
        int deductedItem = bill[k];

        int total = 0;
        for (int bil : bill) {
            total += bil;
        }

        int actual = (total - deductedItem) / 2;

        if (actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(abs(actual - b));
        }

    }

    public static void main(String[] args) {
        int t, sizeOfArray, k, charged;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            sizeOfArray = sc.nextInt();
            k = sc.nextInt();

            int[] arr = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = sc.nextInt();
            }

            charged = sc.nextInt();

            bonAppetit(arr, k, charged);
        }

    }
}
