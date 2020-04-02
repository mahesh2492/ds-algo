package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/halloween-sale/problem
 */
public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        int total = 0, games = 0;
        while (p < s && total <= s) {
            if (total == 0) {
                total += p;
                games += 1;
            } else {
                if (p <= m) {
                    p = m;
                } else {
                    p = p - d;
                    if (p <= m) {
                        p = m;
                    }
                }

                if (total + p > s) {
                    break;
                }
                total += p;
                ++games;
            }
        }

        return games;
    }

    public static void main(String[] args) {
        int t, price, discount, constantDiscount, budget;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            price = sc.nextInt();
            discount = sc.nextInt();
            constantDiscount = sc.nextInt();
            budget = sc.nextInt();
            System.out.println(howManyGames(price, discount, constantDiscount, budget));
        }

    }
}
