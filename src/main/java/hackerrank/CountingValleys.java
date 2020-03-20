package hackerrank;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/counting-valleys/problem
    10 UDUUUDUDDD  0
    10 DUDDDUUDUU  2
    10 DDUDDUUDUU  1
    100 DDUUDDDUDUUDUDDDUUDDUDDDUDDDUDUUDDUUDDDUDDDUDDDUUUDUDDDUDUDUDUUDDUDUDUDUDUUUUDDUDDUUDUUDUUDUUUUUUUUU 2
    100 DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD 5
 */
class CountingValleys {
    static int countingValleys(int n, String s) {
       int noOfValleys = 0, counter = 0, seaLevel = 0;

       char [] valley = s.toCharArray();
       for(int i = 0; i < n; ++i) {
           if(valley[i] == 'U') {
               ++counter;
               if(counter > 0) {
                   seaLevel = 1;
               }

           } else {
               --counter;
               if(counter < 0) {
                   seaLevel = -1;
               }
           }

           if(counter == 0 && seaLevel == -1) {
               seaLevel = 0;
               noOfValleys += 1;
           }
       }

        return noOfValleys;
    }

    public static void main(String[] args) {
        int t, n;
        String s;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while(t-- > 0) {
            n = sc.nextInt();
            s = sc.next();

            System.out.println(countingValleys(n, s));
        }
    }
}
