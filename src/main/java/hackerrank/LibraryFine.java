package hackerrank;

import java.util.Scanner;

/*
  https://www.hackerrank.com/challenges/library-fine/problem
 */
public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if(y1 == y2) {
            if (m1 > m2) {
                return 500 * (m1 - m2);
            } else if(m1 == m2) {
                if (d1 >= d2) {
                    return 15 * (d1 - d2);
                }  else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int t, d1, d2, m1, m2, y1, y2;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            d1 = sc.nextInt();
            m1 = sc.nextInt();
            y1 = sc.nextInt();
            d2 = sc.nextInt();
            m2 = sc.nextInt();
            y2 = sc.nextInt();

            System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
        }
    }
}
