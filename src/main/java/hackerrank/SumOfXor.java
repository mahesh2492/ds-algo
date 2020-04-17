package hackerrank;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/sum-vs-xor/problem
 */
//5 ->
public class SumOfXor {

    public static long sumXor(long n) {
        long numberOfZeroes = 0;
        while(n != 0) {
            if(n % 2 == 0) {
                numberOfZeroes++;
            }
            n = n / 2;
        }
        return 1L << numberOfZeroes;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t -- > 0){
            n = sc.nextInt();
            System.out.println("count " + sumXor(n));
        }
    }
}
/*
2 -> 2, 3 10
3 -> 3   11
4 -> 4, 5, 6, 7 100
5 -> 5, 7 101
6 -> 6, 7 110
7 -> 7 111
8 ->  8  9  10  11  12  13  14  15 1000
9 -> 9  11  13  15 1001
10 -> 10  11  14  15 1010
11 -> 11, 15 1011
12 -> 12  13  14  15
13 -> 13 15
16 -> 16  17  18  19  20  21  22  23  24  25  26  27  28  29  30  31
17 -> 19  21  23  25  27  29  31
18 -> 8  19  22  23  26  27  30  31
19 -> 19  23  27  31
20 -> 20  21  22  23  28  29  30  31
21 ->  21  23  29  31
22 ->  22  23  30  31
 */