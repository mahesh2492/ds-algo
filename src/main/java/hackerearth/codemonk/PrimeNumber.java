package hackerearth.codemonk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/
 */
public class PrimeNumber {

    public static Boolean isPrime(int n) {

        if(n == 1) {
            return false;
        } else {
            for(int i = 2 ; i <= sqrt(n); i++) {
               if(n % i  == 0) {
                   return false;
               }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int t ;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            List<Integer> primes = new ArrayList<>();
            for(int i = 2 ; i < n; i++) {
               if(isPrime(i)) {
                   primes.add(i);
               }
            }
            primes.forEach(e -> System.out.print(e + " "));
        }

    }

}
