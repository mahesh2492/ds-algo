package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/taum-and-bday/editorial
 */
public class TaumAndBday {
    public static long taumBday(long b, long w, long bc, long wc, long z) {
        if (wc == bc || ((bc >= z && bc > wc + z) && (wc >= z && wc > bc + z))) {
            return b * bc + w * wc;
        }

        if (bc > wc) {
            if (wc + z > bc) {
                return b * bc + w * wc;
            } else {
                return (b * (wc + z) + w * wc);
            }
        } else {
            if (bc + z > wc) {
                return (b * bc + w * wc);
            } else {
                return (b * bc + w * (bc + z));
            }
        }
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
