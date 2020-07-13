package hackerrank;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/recursive-digit-sum/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class SuperDigit {

    static int getSumOfDigits(String number) {
        long sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            sum = (sum + Integer.parseInt(ch + "") % 10) % 9;
        }

        return (int) sum;
    }

    static int superDigit(String input, int k) {
        if (input.length() == 1) {
            return Integer.parseInt(input);
        }

        long updatedNumber = getSumOfDigits(input);
        if(updatedNumber * k % 9 == 0) {
            return 9;
        } else {
            return (int) (updatedNumber * k) % 9;
        }
    }

    public static void main(String[] args) {
        int t, k;
        String number;

        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            number = sc.next();
            k = sc.nextInt();

            System.out.println(superDigit(number, k));
        }
    }
}
