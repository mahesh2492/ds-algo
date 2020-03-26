package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/find-digits/problem
 */
public class FindDigits {
    static int findDigits(int n) {
      int noOfDivisors = 0, old = n;
      while (n > 0) {
         int digit = n % 10 ;

         if(digit > 0 && old % digit == 0) {
             noOfDivisors++;
         }
         n = n / 10;
      }

      return noOfDivisors;
    }

    public static void main(String[] args) {
      int t, number;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            number = sc.nextInt();
            System.out.println(findDigits(number));
        }
    }
}
