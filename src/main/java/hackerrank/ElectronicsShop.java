package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int amountSpend = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum <= b) {
                    if (sum > amountSpend) {
                        amountSpend = sum;
                    }

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
