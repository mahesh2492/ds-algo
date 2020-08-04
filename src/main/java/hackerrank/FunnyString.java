package hackerrank;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class FunnyString {

    static String funnyString(String input) {
        int i, j;
        int length = input.length() - 1;
        for(i = 0, j = length; i < length && j > 0; i = i + 2, j = j - 2) {
            System.out.println(" abs(input.charAt(i) - input.charAt(i + 1)) " + abs(input.charAt(i) - input.charAt(i + 1)));
            System.out.println(" abs(input.charAt(j) - input.charAt(j - 1)) " + abs(input.charAt(j) - input.charAt(j - 1)));
            if(abs(input.charAt(i) - input.charAt(i + 1)) != abs(input.charAt(j) - input.charAt(j - 1))) {
                break;
            }
        }

        if(i == input.length() - 1 || i == input.length()) {
          return "Funny";
        }
        return "Not Funny";
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String input = sc.next();
            System.out.println(funnyString(input));
        }
    }
}
