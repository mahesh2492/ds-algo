package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook {

    static int pageCount(int n, int p) {
     return Math.min(p/2, n/2 - p/2);
    }

    public static void main(String[] args) {
       int t, totalPages, page;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0) {
          totalPages = sc.nextInt();
          page = sc.nextInt();

          System.out.println(pageCount(totalPages, page));
        }

    }
}
