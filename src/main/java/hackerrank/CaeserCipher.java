package hackerrank;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 */
public class CaeserCipher {

    static String caesarCipher(String input, int shift) {
        StringBuilder sb = new StringBuilder();

        if(shift > 26) {
           shift = shift % 26;
        }

        for(char ch: input.toCharArray()) {
             if(Character.isLetter(ch)) {
                 if(Character.isLowerCase(ch)) {
                    if(ch + shift > 122) {
                        int offset = (ch + shift) - 122;
                        sb.append((char)('a' + offset - 1));
                    } else {
                        sb.append((char)(ch + shift));
                    }
                 } else {
                     if(ch + shift > 90) {
                         int offset = (ch + shift) - 90;
                         sb.append((char)('A' + offset - 1));
                     } else {
                         sb.append((char)(ch + shift));
                     }
                 }
             } else {
                 sb.append(ch);
             }
         }

        return sb.toString();
    }

    public static void main(String[] args) {
        int t, shift;
        String input;
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();
        while (t-- > 0) {
            input = sc.next();
            shift = sc.nextInt();

            System.out.println(caesarCipher(input, shift));
        }
    }
}
