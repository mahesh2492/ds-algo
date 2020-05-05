package leetcode.may.challenge;

import java.util.Scanner;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/
 */
public class NumberComplement {
    public static int findComplement(int num) {
     String binaryNumber =  Integer.toBinaryString(num)
                .replaceAll("0", "-")
                .replaceAll("1", "0")
                .replaceAll("-", "1");
     int sum = 0;

     for(int i = binaryNumber.length() - 1, j = 0; i >= 0 && j < binaryNumber.length(); i--, j++) {
         sum += Integer.parseInt(binaryNumber.charAt(i) + "")   * Math.pow(2, j);
     }
        return sum;
    }

    public static void main(String[] args) {
        int t, num;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        while (t-- > 0) {
            num = sc.nextInt();
            System.out.println(findComplement(num));
        }
    }
}
