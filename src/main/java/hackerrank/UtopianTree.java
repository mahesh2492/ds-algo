package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree {

    static int utopianTree(int n) {
      int height = 1;
      for(int i = 1; i <= n; ++i) {
         if(i % 2 == 0) {
             height += 1;
         } else {
             height *= 2;
         }
      }
       return height;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while(t-- > 0) {
           n = sc.nextInt();

           System.out.println(utopianTree(n));
        }
    }
}
