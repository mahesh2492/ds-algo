package hackerrank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int amountSpend = -1;

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        for (int i = keyboards.length - 1; i >=0 ; --i) {
            for (int j = drives.length - 1; j >= 0; --j) {
                int sum = keyboards[i] + drives[j];
                if (sum <= b) {
                    amountSpend = Math.max(amountSpend, sum);

                }
            }
        }
        return amountSpend;
    }

    public static void main(String[] args) {
        int t, budget, keyboard, usb, i;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            budget = sc.nextInt();
            keyboard = sc.nextInt();
            usb = sc.nextInt();

            int[] keyboards = new int[keyboard];
            int[] usbs = new int[usb];

            for (i = 0; i < keyboard; i++) {
                keyboards[i] = sc.nextInt();
            }

            for (i = 0; i < usb; i++) {
                usbs[i] = sc.nextInt();
            }

            System.out.println(getMoneySpent(keyboards, usbs, budget));
        }
    }
}
