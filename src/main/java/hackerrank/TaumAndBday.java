package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/taum-and-bday/editorial
 */
public class TaumAndBday {
    public static long taumBday(long black, long white, long bCost, long wCost, long conversionCost) {
        if (bCost > wCost && wCost + conversionCost < bCost) {
                return (black * (wCost + conversionCost) + white * wCost);
        }

        if(wCost > bCost && bCost + conversionCost < wCost) {
                return (black * bCost + white * (bCost + conversionCost));
        }

        return (black * bCost + white * wCost);
    }

    public static void main(String[] args) {
        int t, black, white, bCost, wCost, conversionCost;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            black = sc.nextInt();
            white = sc.nextInt();
            bCost = sc.nextInt();
            wCost = sc.nextInt();
            conversionCost = sc.nextInt();

            System.out.println(taumBday(black, white, bCost, wCost, conversionCost));
        }
    }
}
