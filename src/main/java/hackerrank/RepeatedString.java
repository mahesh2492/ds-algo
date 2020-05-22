package hackerrank;


import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedString {

    static long getACount(String input, long l) {
        long countA = 0;
        for(int i = 0; i < l; i++) {
            if(input.charAt(i) == 'a') {
                countA++;
            }
        }

        return countA;
    }
    static long repeatedString(String input, long n) {
       long countA;
        int length = input.length();
        countA = getACount(input, length);

        if(countA == 0) {
            return 0;
        }

        if(n < length) {
            return getACount(input, length - n + 1);
        }

        long diff = n - length;

        if(countA == length) {
           return n;
        }

       if(diff % length == 0) {
           return (countA + (diff / length) * countA);
       } else {
           long l = diff % length;
           return countA + (diff / length) * countA + getACount(input, l);
       }
    }

    public static void main(String[] args) {
       int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String input = sc.next();
            long times = sc.nextInt();
            System.out.println(repeatedString(input, times));
        }
    }
}
