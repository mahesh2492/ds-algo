package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/chocolate-feast/problem
 */
public class ChocolateFeast {
    static int chocolateFeast(int budget, int chocolatePrice, int minWrappers) {
       int noOfChocolates = budget / chocolatePrice;
       int wrappers = noOfChocolates;

       while(wrappers >= minWrappers) {
           int moreChocolates = wrappers / minWrappers;
           wrappers = wrappers - moreChocolates * minWrappers;
           noOfChocolates += moreChocolates;
           wrappers += moreChocolates;
       }
       return noOfChocolates;
    }

    public static void main(String[] args) {
        int t, budget, price, minWrappers;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while(t-- > 0) {
            budget = sc.nextInt();
            price = sc.nextInt();
            minWrappers = sc.nextInt();
            System.out.println(chocolateFeast(budget, price, minWrappers));
        }
    }
}
