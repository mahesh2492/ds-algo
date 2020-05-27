package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/kaprekar-numbers/problem
 */
public class ModifiedKarprekarNumber {

    static void kaprekarNumbers(long p, long q) {
       List<Integer> list = new ArrayList<>();
        if(p == 1) {
          list.add(1);
          list.add(10);
          p = 10;
      } else {
          if(p < 10) {
              list.add(10);
              p = 10;
          }
      }

      for(long i = p; i <= q; i++) {
          String square = String.valueOf(i * i);

          int mid = square.length() / 2;
          String first = square.substring(0, mid);
          String second = square.substring(mid);

          if(Long.parseLong(first) + Long.parseLong(second) == i) {
              list.add((int)i);

          }
      }

      if(list.isEmpty()) {
          System.out.print("INVALID RANGE");
      } else {
          for(int l: list) {
              System.out.print(l + " ");
          }
      }
    }
  //22222 99999
    public static void main(String[] args) {
        int t, p, q;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            p = sc.nextInt();
            q = sc.nextInt();

           kaprekarNumbers(p, q);
            System.out.println();
        }
    }

}
